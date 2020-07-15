package com.github.iielse.doraemonkit;

import android.content.Context;
import android.widget.Toast;

import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.didichuxing.doraemonkit.kit.Category;
import com.github.iielse.imageviewer.demo.R;

public class EnvSwitchKit extends AbstractKit {
    @Override
    public int getCategory() {
        return Category.BIZ;
    }

    @Override
    public int getName() {
        return R.string.bh_env_switch;
    }

    @Override
    public int getIcon() {
        return R.mipmap.bh_roadbit;
    }

    @Override
    public void onClick(Context context) {
//        DebugService service = ServiceManager.getInstance().getService(context, DebugService.class);
//        PageManager.getInstance().startFragment(service.getContainer(), EnvSwitchFragment.class);
        Toast.makeText(context, "EnvSwitchKit item clicked!!!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAppInit(Context context) {

    }
}
