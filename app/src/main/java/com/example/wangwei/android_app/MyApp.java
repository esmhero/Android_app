package com.example.wangwei.android_app;

import android.app.Application;

/**
 * Created by wangwei on 2017/5/7.
 */

public class MyApp extends Application {
    public String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setName("张三");
    }
}
