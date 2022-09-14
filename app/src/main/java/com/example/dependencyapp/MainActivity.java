package com.example.dependencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Injeção de Dependência

        //Criando um mobile

        //Esta é uma Injeção por Construtor
//        //Estão sendo injetadas a: Bateria, o Processador e o CPU no Construtor
//        Battery batery = new Battery(100);
//        MemoryCard memoryCard = new MemoryCard(1024);
//        Processor processor = new Processor("Intel");
//        CPU cpu = new CPU(processor);
//
//        Mobile mobile = new Mobile(batery, memoryCard, cpu);
//
//        //Injeção por Método (set)
//        mobile.battery.setPowerPercentage(90);
//
//        //Field Injection (Não é recomendável)
//        processor.processorType = "AMD";
//
//        mobile.printMobileStats();

        Mobile mobile;
        MobileComponent mobileComponent = DaggerMobileComponent.create();

        mobile = mobileComponent.getMobile();

        mobile.ringNow();

    }
}