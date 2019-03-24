package com.example.componentlibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Administrator on 2019/3/24.
 */

public interface ILoginService {

    void launch(Context context,String targetClass);

    Fragment getFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);

}
