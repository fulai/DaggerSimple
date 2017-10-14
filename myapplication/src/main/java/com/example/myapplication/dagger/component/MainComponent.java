package com.example.myapplication.dagger.component;

import com.example.myapplication.Main2Activity;
import com.example.myapplication.dagger.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fulai on 2017/10/9.
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    //定义注入的方法
    void inject(Main2Activity activity);
}
