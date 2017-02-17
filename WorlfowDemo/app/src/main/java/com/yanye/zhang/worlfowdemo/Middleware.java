package com.yanye.zhang.worlfowdemo;

import java.util.Map;

/**
 * Created by zhangyanye on 2017/2/16.
 * Description: 中间件，只负责本模块内的工作
 */

public interface Middleware {

    /**
     * handle the request params
     *
     * @param reports
     * @param context
     * @param next
     */
    void handleRequest(Map reports, Map context, WFNext next);

    /**
     * handle the reponse params
     *
     * @param reports
     * @param context
     * @param next
     */
    void handleReponse(Map reports, Map context, WFNext next);
}
