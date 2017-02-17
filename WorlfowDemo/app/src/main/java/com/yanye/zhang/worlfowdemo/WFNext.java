package com.yanye.zhang.worlfowdemo;

/**
 * Created by zhangyanye on 2017/2/16.
 * Description:
 */

public interface WFNext {

    /**
     * excute the next middleware
     */
    void notifyWorkflow();

    /**
     * @param stop      stop the workflow
     * @param exception
     */
    void notifyWorkflow(boolean stop, Exception exception);
}
