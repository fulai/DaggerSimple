package com.example.myapplication.dagger.bean;

/**
 * Created by fulai on 2017/9/29.
 */

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name) {
        this.name = name;

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
