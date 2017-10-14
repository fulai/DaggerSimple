package com.example.myapplication.dagger.bean;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by fulai on 2017/10/9.
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface UserName {
    String name() default "fulai";
}
