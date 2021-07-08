package com.example.demo.dog.conrtoller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.serivce.DogService;
import com.example.demo.dog.serivce.DogServiceImpl;

import java.util.Scanner;

public class DogController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogDTO dog = new DogDTO();
        DogService dogService = new DogServiceImpl();
        System.out.println("색");
        dog.setColor(scanner.next());
        System.out.println("개체");
        dog.setKind(scanner.next());
        System.out.println("품종");
        dog.setBreed(scanner.next());
        String result ="";
        switch (dog.getKind()) {

            case "하얀 진돗개":
                result = dogService.kind(dog);
                break;
        }
        System.out.printf( "%s %s %s= %s",
                dog.getColor(),
                dog.getKind(),
                dog.getBreed(),
                result
                );

    }
}
