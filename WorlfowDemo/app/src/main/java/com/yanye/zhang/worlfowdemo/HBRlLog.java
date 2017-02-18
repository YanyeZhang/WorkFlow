package com.yanye.zhang.worlfowdemo;

import android.content.Context;

import com.yanye.zhang.worlfowdemo.ads.AdsFactory;
import com.yanye.zhang.worlfowdemo.ads.data.AdsReport;
import com.yanye.zhang.worlfowdemo.ads.data.DeviceInfo;

/**
 * Created by zhangyanye on 2017/2/17.
 * Description:
 */

public class HBRlLog {

    private Context mContext;

    public HBRlLog getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void init(Context context, DeviceInfo deviceInfo) {
        mContext = context;

    }

    public void clickLog(AdsReport reports) {
        WorkFlowFactory factory = new AdsFactory();
        Workflow workflow = factory.createWorkfolw();
        workflow.execute(reports, mContext);
    }

    private static class SingletonHolder {
        static HBRlLog INSTANCE = new HBRlLog();
    }

    private HBRlLog() {
    }

}
