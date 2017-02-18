package com.yanye.zhang.worlfowdemo.ads;

import android.content.Context;
import android.util.Log;

import com.yanye.zhang.worlfowdemo.Middleware;
import com.yanye.zhang.worlfowdemo.WFNext;
import com.yanye.zhang.worlfowdemo.ads.data.AdsReport;

/**
 * Created by zhangyanye on 2017/2/17.
 * Description:
 */

public class TestMiddleware implements Middleware<AdsReport> {

    @Override
    public void handleRequest(AdsReport reports, Context context, WFNext next) {
        Log.e("zyy", "request");
        next.notifyWorkflow();
    }

    @Override
    public void handleReponse(AdsReport reports, Context context, WFNext next) {
        Log.e("zyy", "reponse");
        next.notifyWorkflow();
    }

}
