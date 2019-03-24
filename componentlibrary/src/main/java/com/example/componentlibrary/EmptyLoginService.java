package com.example.componentlibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Administrator on 2019/3/24.
 */

public class EmptyLoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {

    }

    @Override
    public Fragment getFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
