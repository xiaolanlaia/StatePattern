package com.example.statepattern;

import android.content.Context;

/**
 * Created by W on 2018/12/17.
 */

public interface UserState {
    /**
     * 转发
     */
    public void forward(Context context);
    /**
     * 评论
     */
    public void comment(Context context);

}
