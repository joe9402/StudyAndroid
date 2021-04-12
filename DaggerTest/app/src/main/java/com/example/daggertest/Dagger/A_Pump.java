package com.example.daggertest.Dagger;

import javax.inject.*;

public class A_Pump implements Pump{

    Heater heater;

    @Inject
    public A_Pump(Heater heater){
        this.heater = heater;
    }
    @Override
    public String pumping() {
        return heater.isHeating()? "A_Pumping Start" : "Do't work" ;
    }
}
