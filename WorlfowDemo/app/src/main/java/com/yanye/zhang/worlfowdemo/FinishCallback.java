package com.yanye.zhang.worlfowdemo;

/**
 * Created by zhangyanye on 2017/2/16.
 * Description:
 */

public interface FinishCallback {

    /**
     * workflow execute successfully
     */
    void onSuccess();

    /**
     * workflow has error
     *
     * @param exception
     */
    void onError(Exception exception);
}
