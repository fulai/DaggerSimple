package com.example.myapplication.dagger.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fulai on 2017/10/9.
 */
@Module
public class AppModule {
    private Context mContext;

    public AppModule(Context context) {
        mContext = context;
    }

    @Provides
    Context providesContext() {
        // 提供Context对象　
        return mContext;
    }
}
