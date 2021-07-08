package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.Scanner;

public class BicycleController/*main*/{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bi = new BicycleDTO();
        System.out.println("몇 기어?");
        bi.setGear(scanner.next());
        System.out.println("회사는 어디?");
        bi.setCompany(scanner.next());
        System.out.println("속도는 얼마?");
        bi.setSpeed(scanner.nextInt());
        System.out.printf(bi.toString());
        }
}
