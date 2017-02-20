package com.yanye.zhang.worlfowdemo;

import android.content.Context;

import com.yanye.zhang.worlfowdemo.ads.AdsFactory;
import com.yanye.zhang.worlfowdemo.ads.data.AdsReport;
import com.yanye.zhang.worlfowdemo.ads.data.DeviceInfo;
import com.yanye.zhang.worlfowdemo.ads.data.ReportEvent;

/**
 * Created by zhangyanye on 2017/2/17.
 * Description:
 */

public class HBRlLog {

    private Context mContext;
    private DeviceInfo mDeviceInfo;

    public HBRlLog getInstance() {
        return SingletonHolder.INSTANCE;
    }


    public void init(Context context, DeviceInfo deviceInfo) {
        mContext = context;

    }

    public void clickLog(ReportEvent reports) {
        WorkFlowFactory factory = new AdsFactory();
        Workflow workflow = factory.createWorkfolw();
        workflow.execute(new AdsReport(reports,mDeviceInfo), mContext);
    }

    private static class SingletonHolder {
        static HBRlLog INSTANCE = new HBRlLog();
    }

    private HBRlLog() {
    }

}
