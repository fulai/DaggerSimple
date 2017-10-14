package com.example.myapplication.dagger.component;

import com.example.myapplication.MainActivity;
import com.example.myapplication.dagger.bean.Login;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by fulai on 2017/10/9.
 */
@Subcomponent
public interface LoginComponent {
    void inject(MainActivity activity);
}
