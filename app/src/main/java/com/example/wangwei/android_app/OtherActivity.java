package com.example.wangwei.android_app;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by wangwei on 2017/5/7.
 */

public class OtherActivity extends Activity {
    private MyApp myApp;
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        textView=(TextView)this.findViewById(R.id.msg);
        myApp=(MyApp)getApplication();
        textView.setText("--appname-->>"+myApp.getName());
    }
}
