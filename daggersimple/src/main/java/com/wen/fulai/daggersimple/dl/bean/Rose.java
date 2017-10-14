package com.wen.fulai.daggersimple.dl.bean;

import javax.inject.Inject;

/**
 * Created by fulai on 2017/10/14.
 */

public class Rose {
    @Inject
    public Rose() {}

    public String whisper()  {
        return "热恋";
    }
}
