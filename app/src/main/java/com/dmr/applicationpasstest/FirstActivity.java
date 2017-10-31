package com.dmr.applicationpasstest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        textView = (TextView) findViewById(R.id.show);
        myApplication application = (myApplication) getApplication();
        textView.setText("用户名："+application.getName()+"\n密码:"+application.getPass());

    }

    public  void jump(View v){
        //跳转页面
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
