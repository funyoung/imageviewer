package com.github.iielse.imageviewer.demo;

import androidx.multidex.MultiDexApplication;

import com.didichuxing.doraemonkit.DoraemonKit;

/**
 * @author yangfeng
 */
public class ViewerApplication extends MultiDexApplication {
    private static final String PRODUCT_ID = "8b05675d9a39194a42e2530796a4e91f";
    @Override
    public void onCreate() {
        super.onCreate();

        DoraemonKit.install(this, PRODUCT_ID);
    }
}
