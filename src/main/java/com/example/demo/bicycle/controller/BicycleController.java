package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;


import java.util.Scanner;


public class BicycleController/*main*/{
    private BicycleService bicycleService;
    private BicycleDTO bicycle;
    private Scanner scanner;

    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
        this.bicycle = new BicycleDTO();
        this.scanner =new Scanner(System.in);
    }

   public void main(){
        BicycleDTO bicycle = new BicycleDTO();
        System.out.println("기어가 몇단 입니까?");
        bicycle.setGear(scanner.nextInt());
        System.out.println("페달은 무엇입니까?");
        bicycle.setPedal(scanner.next());
        System.out.println("속도는 얼마입니까?");
        bicycle.setSpeed(scanner.nextInt());
        System.out.print(bicycle.toString());
   }
        /* Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycle=null;
        while(true){
            print.accept("[메뉴]: 0-종료 1-추가 2-카운트 3-목록");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    bicycle=new BicycleDTO();
                    print.accept("기어");
                    bicycle.setGear(scanner.nextInt());
                    print.accept("페달");
                    bicycle.setPedal(scanner.next());
                    print.accept("속도");
                    bicycle.setSpeed(scanner.nextInt());
                    bicycleService.add(bicycle);
                case "2":
                    print.accept(string.apply(bicycleService.count()));
                case "3":
                    List<BicycleDTO> list= (List<BicycleDTO>) bicycleService.show();
                    for (BicycleDTO b: list){
                        print.accept(b.toString());
                    }
            }
        }
    }

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
    }*/

}
