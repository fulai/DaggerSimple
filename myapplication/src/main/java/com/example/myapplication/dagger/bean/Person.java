package com.example.myapplication.dagger.bean;

import android.content.Context;
import android.util.Log;

/**
 * Created by fulai on 2017/10/9.
 */

public class Person {
    private Context mContext;
    private String name;

    public Person(Context context) {
        mContext = context;
        Log.i("dagger", "create");
    }

    public Person(String name) {
        this.name = name;
    }
}
