package com.yanye.zhang.worlfowdemo;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangyanye on 2017/2/17.
 * Description:
 */

public class HBWorkflowManager implements Workflow, WFNext {

    private static final boolean EXECUTE_REQUEST = true;
    private static final boolean EXECUTE_REPONSE = false;

    private boolean mExecuteType;
    private int mIndex = 0;
    private int mSize = 0;
    private Map mReports;
    private Map mContext;
    private List<Middleware> mMiddlewares;

    public HBWorkflowManager() {
        mExecuteType = EXECUTE_REQUEST;
        mMiddlewares = new ArrayList<>();
    }

    private FinishCallback mCallback;

    @Override
    public Workflow use(Middleware middleware) {
        mMiddlewares.add(middleware);
        return this;
    }

    @Override
    public void execute(@NonNull Map reports) {
        execute(reports, null, new NullFinishCallback());
    }

    @Override
    public void execute(@NonNull Map reports, Map context, FinishCallback callback) {
        mSize = mMiddlewares.size();
        if (mSize == 0) {
            return;
        }
        mReports = reports;
        mContext = context;
        mCallback = callback;

        handleMiddleware(true);
    }

    @Override
    public void notifyWorkflow() {
        notifyWorkflow(false, null);
    }

    @Override
    public void notifyWorkflow(boolean stop, Exception exception) {
        if (stop) {
            mCallback.onError(exception);
            return;
        }
        int maxIndex = mSize - 1;
        if (mIndex < maxIndex && mExecuteType == EXECUTE_REQUEST) {
            mIndex++;
        } else if (mIndex == maxIndex) {
            mExecuteType = EXECUTE_REPONSE;
        } else {
            mIndex--;
        }

        if (mIndex >= 0) {
            handleMiddleware(mExecuteType);
        } else {
            mCallback.onSuccess();
        }
    }

    /**
     * @param executeRequest
     */
    private void handleMiddleware(boolean executeRequest) {
        Middleware middleware = mMiddlewares.get(mIndex);
        if (executeRequest) {
            middleware.handleRequest(mReports, mContext, this);
        } else {
            middleware.handleReponse(mReports, mContext, this);
        }
    }

}
