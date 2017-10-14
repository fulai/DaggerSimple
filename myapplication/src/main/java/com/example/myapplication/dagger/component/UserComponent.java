package com.example.myapplication.dagger.component;


import com.example.myapplication.MainActivity;
import com.example.myapplication.dagger.module.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fulai on 2017/9/29.
 * //Component 链接被注入的地方和提供依赖的地方
 */
@Singleton
@Component(modules = UserModule.class)
public interface UserComponent {
    void inject(MainActivity activity);
}
