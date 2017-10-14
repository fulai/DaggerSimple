package com.wen.fulai.daggersimple.dl.bean;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by fulai on 2017/10/14.
 */

public class Pony {
    private Flower flower;

    public Pony(Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }

}
