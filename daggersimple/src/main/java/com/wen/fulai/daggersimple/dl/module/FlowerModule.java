package com.wen.fulai.daggersimple.dl.module;

import com.wen.fulai.daggersimple.dl.bean.Alise;
import com.wen.fulai.daggersimple.dl.bean.Flower;
import com.wen.fulai.daggersimple.dl.bean.Lily;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fulai on 2017/10/14.
 * 使用@Inject标记构造器提供依赖是有局限性的，比如说我们需要注入的对象是第三方库提供的
 * 我们无法在第三方库的构造器上加上@Inject注解。
 * 或者，我们使用依赖倒置的时候，因为需要注入的对象是抽象的，@Inject也无法使用，因为抽象的类并不能实例化
 */
@Module
public class FlowerModule {
    @Named("Alise")
    @Provides
    Flower provideAlise() {
        return new Alise();
    }

    @Named("Lily")
    @Provides
    Flower provideLily() {
        return new Lily();
    }
}
