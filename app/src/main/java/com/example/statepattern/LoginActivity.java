package com.example.statepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText userNameEditText;
    EditText pwdEditTtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userNameEditText = (EditText)findViewById(R.id.username_edittext);
        pwdEditTtext = (EditText)findViewById(R.id.pwdEditTtext);

        //登录按钮
        findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
                finish();
            }
        });

    }
    private void login(){
        String pwd = pwdEditTtext.getText().toString().trim();

        //执行网络请求.进行登录
        //登录成功后修改为已登录状态
        LoginContext.getLoginContext().setState(new LoginedState());
        Toast.makeText(getApplicationContext(),"登陆成功",Toast.LENGTH_SHORT).show();
    }
}
