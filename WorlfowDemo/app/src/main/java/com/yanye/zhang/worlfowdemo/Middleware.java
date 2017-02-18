package com.yanye.zhang.worlfowdemo;

import android.content.Context;

import java.util.Map;

/**
 * Created by zhangyanye on 2017/2/16.
 * Description: 中间件，只负责本模块内的工作
 */

public interface Middleware<T>{

    /**
     * handle the request params
     *
     * @param reports
     * @param context
     * @param next
     */
    void handleRequest(T reports, Context context, WFNext next);

    /**
     * handle the reponse params
     *
     * @param reports
     * @param context
     * @param next
     */
    void handleReponse(T reports, Context context, WFNext next);
}
