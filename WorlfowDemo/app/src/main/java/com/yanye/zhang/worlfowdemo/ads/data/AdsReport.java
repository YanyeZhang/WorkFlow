package com.yanye.zhang.worlfowdemo.ads.data;

/**
 * Created by zhangyanye on 2017/2/17.
 * Description:
 */

public class AdsReport {

    public DeviceInfo common;

    public ReportEvent event;

    public AdsReport(ReportEvent event, DeviceInfo common) {
        this.common = common;
        this.event = event;
    }
}
