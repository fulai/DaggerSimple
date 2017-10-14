package com.wen.fulai.daggersimple.dl.component;

import com.wen.fulai.daggersimple.dl.bean.Flower;
import com.wen.fulai.daggersimple.dl.module.FlowerModule;
import com.wen.fulai.daggersimple.dl.module.PonyModule;

import javax.inject.Named;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by fulai on 2017/10/14.
 */

@Component(modules = FlowerModule.class)
public interface FlowerComponent {
    @Named("Alise")
    Flower getFlowerAlise();

    @Named("Lily")
    Flower getFlowerLily();
}

/**
 * FlowerComponent管理了PotComponent和MainActivityComponent
  */
//@Component(modules = FlowerModule.class)
//public interface FlowerComponent {
//    PonyComponent plus(PonyModule ponyModule);
//}
