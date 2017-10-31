package com.dmr.applicationpasstest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private EditText etname, etpass;
    private myApplication myapplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login);
        etname = (EditText) findViewById(R.id.etname);
        etpass = (EditText) findViewById(R.id.etpass);

        //获取application对象 并赋值
        myapplication = (myApplication) getApplication();


        //登录点击之后跳转页面
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //存值
                myapplication.setName(etname.getText().toString());
                myapplication.setPass(etpass.getText().toString());
                //跳转页面
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);

            }
        });
    }
}
