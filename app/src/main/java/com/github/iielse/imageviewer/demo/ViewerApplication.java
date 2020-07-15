package com.github.iielse.imageviewer.demo;

import androidx.multidex.MultiDexApplication;

import com.didichuxing.doraemonkit.DoraemonKit;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.github.iielse.doraemonkit.EnvSwitchKit;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yangfeng
 */
public class ViewerApplication extends MultiDexApplication {
    private static final String PRODUCT_ID = "8b05675d9a39194a42e2530796a4e91f";
    @Override
    public void onCreate() {
        super.onCreate();

        LinkedHashMap<String, List<AbstractKit>> kits = new LinkedHashMap<>();
        List<AbstractKit> kl = new LinkedList<>();
        kl.add(new EnvSwitchKit());
        kits.put(getString(R.string.bh_customization), kl);
        DoraemonKit.install(this, kits, PRODUCT_ID);
    }
}
