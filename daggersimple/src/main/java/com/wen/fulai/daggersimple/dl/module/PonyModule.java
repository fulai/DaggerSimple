package com.wen.fulai.daggersimple.dl.module;

import com.wen.fulai.daggersimple.dl.bean.Flower;
import com.wen.fulai.daggersimple.dl.bean.Pony;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fulai on 2017/10/14.
 */
@Module
public class PonyModule {
    @Provides
    Pony providePony(@Named("Alise") Flower flower) {
        return new Pony(flower);
    }
}
