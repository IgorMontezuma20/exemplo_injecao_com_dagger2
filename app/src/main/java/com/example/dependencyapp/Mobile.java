package com.example.dependencyapp;

import javax.inject.Inject;

public class Mobile {

    Battery battery;
    MemoryCard memoryCard;
    CPU cpu;


    //A interface bateria não pode ser passada, deve ser usado um child
    @Inject
    public Mobile(Battery battery, MemoryCard memoryCard, CPU cpu) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.cpu = cpu;
    }

    public void ringNow(){
        System.out.println("Ringing");
    }


}
