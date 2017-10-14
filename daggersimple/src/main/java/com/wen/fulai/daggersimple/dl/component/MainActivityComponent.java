package com.wen.fulai.daggersimple.dl.component;

import com.wen.fulai.daggersimple.MainActivity;
import com.wen.fulai.daggersimple.dl.module.FlowerModule;
import com.wen.fulai.daggersimple.dl.module.PonyModule;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by fulai on 2017/10/14.
 * 这就是Component的dependencies的用法了，
 * 我们Component不需要重复的指定Module，
 * 可以直接依赖其它Component获得。
 */

@Component(dependencies = PonyComponent.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}

//@Subcomponent
//public interface MainActivityComponent{
//    void inject(MainActivity activity);
//}