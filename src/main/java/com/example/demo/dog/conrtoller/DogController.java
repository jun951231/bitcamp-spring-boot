package com.example.demo.dog.conrtoller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.serivce.DogService;
import com.example.demo.dog.serivce.DogServiceImpl;

import java.util.Scanner;

public class DogController {
        Scanner scanner = new Scanner(System.in);
        DogDTO dog = new DogDTO();
        DogService dogService = new DogServiceImpl();

        public void dog(){
        System.out.println("색");
        dog.setColor(scanner.next());
        System.out.println("품종");
        dog.setBreed(scanner.next());
        System.out.println("개체");
        dog.setKind(scanner.next());
        String result ="";
        switch (dog.getKind()){
            case "":
                result = dogService.info(dog);
                break;
        }
        System.out.printf( "%s %s %s= %s",
                dog.getColor(),
                dog.getBreed(),
                dog.getKind(),
                result);
    }

public void info(){
    System.out.println("개 색");
    dog.setColor(scanner.next());
    System.out.println("개 품종");
    dog.setBreed(scanner.next());
    System.out.println("개 개체");
    dog.setKind(scanner.next());
    String arr = dogService.info(dog);
        System.out.print("\t");
        }

}



