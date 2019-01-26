package com.jay.unitconverter;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

//import com.google.android.gms.ads.MobileAds;

/**
 * Created by Jay on 07-10-2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
//        MobileAds.initialize(this, "ca-app-pub-4955764862648857~9975509281");
    }
}
