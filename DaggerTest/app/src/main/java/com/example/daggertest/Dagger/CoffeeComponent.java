package com.example.daggertest.Dagger;


import dagger.*;

@Subcomponent(modules = CoffeeModule.class)
public interface CoffeeComponent {
    @Subcomponent.Builder
    interface Builder{
       // Builder CoffeeModule(CoffeeModule coffeeModule);
        CoffeeComponent build();
    }

    CoffeeMaker createCoffeemaker();
}
