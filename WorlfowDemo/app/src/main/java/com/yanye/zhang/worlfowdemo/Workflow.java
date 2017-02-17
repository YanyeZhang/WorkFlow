package com.yanye.zhang.worlfowdemo;

import java.util.Map;

/**
 * Created by zhangyanye on 2017/2/16.
 * Description:  工作流负责顺序处理中间件
 * design from  https://my.oschina.net/qiaotoubao/blog/735675?utm_source=tuicool&utm_medium=referral
 */

public interface Workflow {

    /**
     * add the middleware into workflow
     *
     * @param middleware
     */
    Workflow use(Middleware middleware);

    /**
     * execute the workflow
     *
     * @param reports
     */
    void execute(Map reports);

    /**
     * @param reports  the data that need to report
     * @param context  the data that work for workflow
     * @param callback
     */
    void execute(Map reports, Map context, FinishCallback callback);

}
