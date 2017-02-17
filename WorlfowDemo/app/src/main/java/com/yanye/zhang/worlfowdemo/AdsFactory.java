package com.yanye.zhang.worlfowdemo;

/**
 * Created by zhangyanye on 2017/2/17.
 * Description:
 */

public class AdsFactory implements WorkFlowFactory {

    @Override
    public Workflow createWorkfolw() {
        return new HBWorkflowManager()
                .use(new TestMiddleware());
    }
}
