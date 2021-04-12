package com.example.daggertest.Dagger;

import javax.inject.*;

public class CoffeeMaker {

    Heater heater;
    Pump pump;

    @Inject
    public CoffeeMaker(Heater heater, Pump pump){
        this.heater = heater;
        this.pump = pump;
    }

    public String brew(){
        heater.on();
        String a = (heater.isHeating()? "is heating" : "is Cold") + " => " + pump.pumping();
        heater.off();
        return a;
    }

}
