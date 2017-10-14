package com.wen.fulai.daggersimple.dl.component;

import com.wen.fulai.daggersimple.dl.bean.Flower;
import com.wen.fulai.daggersimple.dl.bean.Pony;
import com.wen.fulai.daggersimple.dl.module.FlowerModule;
import com.wen.fulai.daggersimple.dl.module.PonyModule;

import javax.inject.Named;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by fulai on 2017/10/14.
 */

@Component(dependencies = FlowerComponent.class, modules = PonyModule.class)
public interface PonyComponent {
    Pony getPony();
    @Named("Alise")
    Flower getFlower();
}
//@Subcomponent(modules = {PonyModule.class})
//public interface PonyComponent {
//    MainActivityComponent plus();
//}
