package com.example.demo.common.controller;

import com.example.demo.BankAccount.controller.BankController;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.conrtoller.DogController;
import com.example.demo.math.controller.MathController;
import com.example.demo.util.controller.UtilController;
import com.example.demo.himart.controller.HimartController;


import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
                System.out.println("\n[메뉴] 0.종료 1.유틸 2.계산기 3.개 4.자전거 5.하이마트 6.비트은행 ");
                switch (scanner.next()){
                    case "0": return;
                    case "1": new UtilController().main(); break;
                    case "2": new MathController().main(); break;
                    case "3": new DogController().main(); break;
                    case "4": new BicycleController().main(); break;
                    case "5": new HimartController().main(); break;
                    case "6": new BankController().main(); break;


                }
        }
    }
}
/*
DogDTO dog = new DogDTO();
                        DogService dogService = new DogServiceImpl();
                        System.out.println("이름이 무엇");
                        dog.setName(scanner.next());
                        System.out.println("색깔은 무엇");
                        dog.setColor(scanner.next());
                        System.out.println("품종은 무엇");
                        dog.setBreed(scanner.next());
                        dogController.add(dog);
                        break;
                    case "33" :
                        dogController.show();
BicycleDTO bicycle= new BicycleDTO();
                        BicycleService bicycleService = new BicycleServiceImpl();
                        System.out.println("기어가 몇단?");
                        bicycle.setGear(scanner.nextInt());
                        System.out.println("페달은 무엇");
                        bicycle.setPedal(scanner.next());
                        System.out.println("속도는 얼마");
                        bicycle.setSpeed(scanner.nextInt());
                        bicycleController.(bicycle);
                        break;
                    case "44":
                        bicycleController.();*/