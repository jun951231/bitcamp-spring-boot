package com.example.demo.common.controller;

import com.example.demo.BankAccount.controller.BankAccountController;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import com.example.demo.dog.conrtoller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.serivce.DogService;
import com.example.demo.dog.serivce.DogServiceImpl;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.controller.UtilController;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        while(true){
                System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.개등록 33.개목록 4. 자전거등록 44.자전거목록 5.오늘날짜");
                switch (scanner.next()){
                    case "0": return;
                    case "1": new CalculatorController().calculate(); break;
                    case "2": new CalculatorController().sequence(); break;
                    case "3":
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
                        break;
                    case "4":
                        BicycleDTO bicycle= new BicycleDTO();
                        BicycleService bicycleService = new BicycleServiceImpl();
                        System.out.println("기어가 몇단?");
                        bicycle.setGear(scanner.nextInt());
                        System.out.println("페달은 무엇");
                        bicycle.setPedal(scanner.next());
                        System.out.println("속도는 얼마");
                        bicycle.setSpeed(scanner.nextInt());
                        bicycleController.add(bicycle);
                        break;
                    case "44":
                        bicycleController.show();
                    case "5": new UtilController().todayAndCurrentTime(); break;
                }
        }
    }
}
