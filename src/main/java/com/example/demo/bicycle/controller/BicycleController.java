package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import org.springframework.stereotype.Controller;


import java.util.ArrayList;
import java.util.Scanner;
@Controller

public class BicycleController/*main*/{
    private BicycleService bicycleService;

    public BicycleController(){
        bicycleService = new BicycleServiceImpl();
    }

    public void add(BicycleDTO bicycle){
        bicycleService.add(bicycle);
    }

    public int count(){
        return bicycleService.count();
    }

    public void show(){
        System.out.println("자전거의 수 : "+ bicycleService.count());
        System.out.println(bicycleService.show());
    }

    public String changingGear(String gear) {
        return bicycleService.changingGear(gear);
    }

    public String changingPedalCadence(String pedal) {
        return bicycleService.changingPedalCadence(pedal);
    }

    public String applyingBrakes(String brakes) {
        return bicycleService.applyingBrakes();
    }








}
