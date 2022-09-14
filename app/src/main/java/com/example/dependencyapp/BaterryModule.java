package com.example.dependencyapp;

import dagger.Module;
import dagger.Provides;

@Module
public class BaterryModule {

    @Provides
    Battery provideBattryMethod(){
        return new Battery();
    }

}
