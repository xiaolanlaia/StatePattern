package com.example.statepattern;

import android.content.Context;

/**
 * Created by W on 2018/12/17.
 */

public class LoginContext {

    /**
     * 用户状态，默认为未登录状态
     */
    UserState mState = new LogoutState();
    /**
     * 单例
     */
    static LoginContext sLoginContext = new LoginContext();

    private LoginContext(){}

    public static LoginContext getLoginContext(){
        return sLoginContext;
    }
    public void setState(UserState aState){
        this.mState = aState;
    }

    /**
     * 转发
     * @param context
     */
    public void forward(Context context){
        mState.forward(context);
    }
    public void comment(Context context){
        mState.comment(context);
    }
}
