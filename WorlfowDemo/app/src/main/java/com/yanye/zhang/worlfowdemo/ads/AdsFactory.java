package com.yanye.zhang.worlfowdemo.ads;

import com.yanye.zhang.worlfowdemo.WorkFlowFactory;
import com.yanye.zhang.worlfowdemo.Workflow;

/**
 * Created by zhangyanye on 2017/2/17.
 * Description:
 */

public class AdsFactory implements WorkFlowFactory {

    @Override
    public Workflow createWorkfolw() {
        return new AdsWorkflowManager()
                .use(new TestMiddleware());
    }
}
