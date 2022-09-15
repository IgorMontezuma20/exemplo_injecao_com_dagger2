package com.example.dependencyapp;

import dagger.Module;
import dagger.Provides;

// O Dagger vai reconhecer esta dependência como uma Battery
@Module
public class NickelBatteryModule {

    @Provides
    Battery provideNickelBattery(NickelBattery nickelBattery){
        nickelBattery.showType();
        return nickelBattery;
    }

}
