package com.example.daggertest.Dagger;

import javax.inject.Inject;
import javax.inject.Named;

public class PartTimeJob {
    String cafeName;

    @Inject
    public PartTimeJob(/*@Named("CafeName")*/ String cafename){
        this.cafeName = cafename;
    }

    public String whereWorks(){
        return "working on " + cafeName;
    }
}
