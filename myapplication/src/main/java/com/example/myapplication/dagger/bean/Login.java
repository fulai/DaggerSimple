package com.example.myapplication.dagger.bean;

import javax.inject.Inject;

/**
 * Created by fulai on 2017/10/8.
 */

public class Login {
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    @Inject
    public Login() {
    }

//    @LoginName(name = "fully")
//    @Inject
//    public Login(String name) {
//        this.name = name;
//    }

    public Login(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
