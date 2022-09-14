package com.example.dependencyapp;

import dagger.Component;

@Component(modules = BaterryModule .class)
public interface MobileComponent {

    Mobile getMobile();

}
