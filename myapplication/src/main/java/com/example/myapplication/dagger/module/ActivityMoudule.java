package com.example.myapplication.dagger.module;

import android.content.Context;

import com.example.myapplication.dagger.bean.Person;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fulai on 2017/10/9.
 */
@Module
public class ActivityMoudule {
    @Provides
    Person providePerson(Context context) {
        //　此方法需要Context 对象
        return new Person(context);
    }
}
