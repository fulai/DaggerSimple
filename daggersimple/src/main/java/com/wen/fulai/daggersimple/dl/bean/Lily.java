package com.wen.fulai.daggersimple.dl.bean;

import javax.inject.Inject;

/**
 * Created by fulai on 2017/10/14.
 */

public class Lily extends Flower {
    @Inject
    public Lily() {
    }

    @Override
    public String whisper() {
        return "纯洁";
    }
}
