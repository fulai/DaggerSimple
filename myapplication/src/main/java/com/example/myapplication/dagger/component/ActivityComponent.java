package com.example.myapplication.dagger.component;

import com.example.myapplication.Main2Activity;
import com.example.myapplication.dagger.module.ActivityMoudule;

import dagger.Component;

/**
 * Created by fulai on 2017/10/9.
 */
@Component(dependencies = AppComponent.class, modules = ActivityMoudule.class)
public interface ActivityComponent {
    // 注入
    void inject(Main2Activity activity);
}
