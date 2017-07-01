package com.ismekveritabani;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.app.Application;

public class IsmekApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
