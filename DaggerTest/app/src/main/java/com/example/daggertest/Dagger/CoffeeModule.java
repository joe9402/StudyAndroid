package com.example.daggertest.Dagger;

import dagger.*;

@Module
public class CoffeeModule {
    @Provides
    public Heater provideHeater(){
        return new A_Heater();
    }

    @Provides
    public Pump providePump(Heater heater){
        return new A_Pump(heater);
    }
}
