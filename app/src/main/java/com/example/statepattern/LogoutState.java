package com.example.statepattern;

import android.content.Context;
import android.content.Intent;

/**
 * Created by W on 2018/12/17.
 */

public class LogoutState implements UserState{
    @Override
    public void forward(Context context){
        gotLoginActivity(context);
    }
    @Override
    public void comment(Context context){
        gotLoginActivity(context);
    }
    private void gotLoginActivity(Context context){
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }
}
