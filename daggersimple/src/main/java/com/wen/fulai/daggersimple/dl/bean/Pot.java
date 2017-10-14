package com.wen.fulai.daggersimple.dl.bean;

import javax.inject.Inject;

/**
 * Created by fulai on 2017/10/14.
 */

public class Pot {
    private Rose rose;
    private Jake jake;

    @Inject
    public Pot(Rose rose, Jake jake) {
        this.rose = rose;
        this.jake = jake;
    }

    @Override
    public String toString() {
        return "Pot{" +
                "rose=" + rose.whisper() +
                ", jake=" + jake.whisper() +
                '}';
    }

    public String show() {
        return rose.whisper();
    }

}
