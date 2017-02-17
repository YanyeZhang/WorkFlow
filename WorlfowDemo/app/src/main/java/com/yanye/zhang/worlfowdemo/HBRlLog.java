package com.yanye.zhang.worlfowdemo;

import java.util.Map;

/**
 * Created by zhangyanye on 2017/2/17.
 * Description:
 */

public class HBRlLog {

    public void clickLog(Map reports) {
        WorkFlowFactory factory = new AdsFactory();
        Workflow workflow = factory.createWorkfolw();
        workflow.execute(reports);
    }
}
