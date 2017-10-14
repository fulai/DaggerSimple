package com.example.myapplication.dagger.component;

import android.content.Context;

import com.example.myapplication.dagger.module.AppModule;

import dagger.Component;

/**
 * Created by fulai on 2017/10/9.
 */
@Component(modules = AppModule.class)
public interface AppComponent {
    // 向其下层提供Context 对象
    Context proContext();
}
