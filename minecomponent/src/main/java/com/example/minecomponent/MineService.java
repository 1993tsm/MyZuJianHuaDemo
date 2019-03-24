package com.example.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.example.componentlibrary.IMineService;

/**
 * Created by Administrator on 2019/3/24.
 */

public class MineService implements IMineService {
    @Override
    public void launch(Context context, String userId) {
        Intent intent = new Intent(context,MActivity.class);
        context.startActivity(intent);
    }
}
