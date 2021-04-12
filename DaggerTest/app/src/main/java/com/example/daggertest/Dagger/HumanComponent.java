package com.example.daggertest.Dagger;

import dagger.*;

@Subcomponent(modules = HumanModule.class)
public interface HumanComponent {

    @Subcomponent.Builder
    interface Builder{
        HumanComponent build();
    }

    PartTimeJob createPartTimeJob();
}
