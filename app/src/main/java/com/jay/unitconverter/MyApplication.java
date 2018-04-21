package com.jay.unitconverter;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.ads.MobileAds;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Jay on 07-10-2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        MobileAds.initialize(this, "ca-app-pub-7157417608226077~2192048412");
    }
}
