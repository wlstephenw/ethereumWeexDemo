package com.example.wanglei.hybridapp;

import android.app.Application;

import com.example.wanglei.hybridapp.extend.ImageAdapter;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by wanglei on 2018/4/3 0003.
 */

public class WXApplication extends Application {
        @Override
        public void onCreate() {
            super.onCreate();
            InitConfig config = new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
            WXSDKEngine.initialize(this,config);
        }

}
