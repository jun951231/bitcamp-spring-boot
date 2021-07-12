package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;

import java.util.Scanner;

public class BicycleController/*main*/{
    Scanner scanner = new Scanner(System.in);
    BicycleDTO bi = new BicycleDTO();
    BicycleService bicycleService = new BicycleServiceImpl();

    public void BicycleInfo(){
        System.out.println("몇 기어?");
        bi.setGear(scanner.next());
        System.out.println("회사는 어디?");
        bi.setCompany(scanner.next());
        System.out.println("속도는 얼마?");
        bi.setSpeed(scanner.nextInt());
        String result = "";
        switch (bi.getCompany()){
            case "":
                result = bicycleService.information(bi);
            break;
        }
        System.out.printf( " %s = %s",
            bi.getCompany(),
            result);
    }
public void information(){
    System.out.println("자전거 회사");
    bi.setCompany(scanner.next());
    }

}
