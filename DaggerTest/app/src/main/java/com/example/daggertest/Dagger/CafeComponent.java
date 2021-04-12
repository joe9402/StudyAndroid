package com.example.daggertest.Dagger;

import javax.inject.Named;

import dagger.*;

@Component(modules = CafeModule.class)
public interface CafeComponent {

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder cafeName(String cafename);
        CafeComponent build();
    }

    CoffeeComponent.Builder createCoffeeComponent();

    HumanComponent.Builder createHumanComponent();
}
