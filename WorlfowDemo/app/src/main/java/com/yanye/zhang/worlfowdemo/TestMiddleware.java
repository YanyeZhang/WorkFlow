package com.yanye.zhang.worlfowdemo;

import android.util.Log;

import java.util.Map;

/**
 * Created by zhangyanye on 2017/2/17.
 * Description:
 */

public class TestMiddleware implements Middleware {

    @Override
    public void handleRequest(Map reports, Map context, WFNext next) {
        Log.e("zyy", "request");
        next.notifyWorkflow();
    }

    @Override
    public void handleReponse(Map reports, Map context, WFNext next) {
        Log.e("zyy", "reponse");
        next.notifyWorkflow();
    }
}
