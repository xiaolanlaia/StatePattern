package com.example.statepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.forward_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginContext.getLoginContext().forward(MainActivity.this);
            }
        });
        //注销按钮
        findViewById(R.id.logout_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //设置为注销状态
                LoginContext.getLoginContext().setState(new LogoutState());
            }
        });
    }
}
