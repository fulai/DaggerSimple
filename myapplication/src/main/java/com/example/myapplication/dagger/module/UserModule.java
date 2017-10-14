package com.example.myapplication.dagger.module;


import com.example.myapplication.dagger.bean.User;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fulai on 2017/9/29.
 * //标识该类提供依赖
 */
@Module
public class UserModule {
    @Singleton
    @Provides
        //告诉Dagger我们想要构造对象并提供这些依赖
    User provideUser() {
        return new User("fulai", 22);
    }

    @Named("fulai")
    @Provides
    User provideUserAndName() {
        return new User("fulai_add");
    }

}
