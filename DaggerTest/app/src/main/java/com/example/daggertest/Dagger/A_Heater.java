package com.example.daggertest.Dagger;

import javax.inject.*;

public class A_Heater implements Heater {
    boolean heating = false;

    @Inject
    public A_Heater(){}

    @Override
    public void on() {
        heating = true;
    }

    @Override
    public void off() {
        heating = false;
    }

    @Override
    public boolean isHeating() {
        return heating? true:false;
    }

}
