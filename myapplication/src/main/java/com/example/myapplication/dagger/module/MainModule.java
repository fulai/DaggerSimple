package com.example.myapplication.dagger.module;

import android.content.Context;

import com.example.myapplication.dagger.bean.Person;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fulai on 2017/10/9.
 * 在编写Module中，不能出现传入参数和返回参数一致的情况，会导致死循环。
 */
@Module
public class MainModule {
    private Context mContext;

    public MainModule(Context context) {
        mContext = context;
    }


    @Provides
    Context providesContext() {
        // 提供上下文对象
        return mContext;
    }

    @Provides // 关键字，标明该方法提供依赖对象
    @Singleton
    Person providerPerson(Context context) {
        return new Person(context);
    }

}
