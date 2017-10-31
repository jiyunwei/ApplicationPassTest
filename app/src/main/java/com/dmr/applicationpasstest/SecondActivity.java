package com.dmr.applicationpasstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = (TextView) findViewById(R.id.show);
        myApplication application = (myApplication) getApplication();
        textView.setText("用户名："+application.getName()+"\n密码:"+application.getPass());
    }
}
