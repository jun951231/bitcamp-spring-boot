package com.example.demo.dog.conrtoller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.serivce.DogService;
import com.example.demo.dog.serivce.DogServiceImpl;

import java.util.Scanner;

public class DogController {
        private DogService dogService;
        private DogDTO dog;
        private Scanner scanner;

        public DogController(){
            this.dogService = new DogServiceImpl();
            this.dog = new DogDTO();
            this.scanner = new Scanner(System.in);
    }

public void main(){
    System.out.println("이름이 무엇");
    dog.setColor(scanner.next());
    System.out.println("색깔은 무엇");
    dog.setColor(scanner.next());
    System.out.println("품종은 무엇");
    dog.setBreed(scanner.next());
    System.out.println("배고픈가?");
    dog.setHungry(scanner.next());
    System.out.println(dog.toString());
    }


}



