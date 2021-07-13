package com.example.demo.dog.conrtoller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.serivce.DogService;
import com.example.demo.dog.serivce.DogServiceImpl;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Scanner;
@Controller


public class DogController {

    private DogService dogService;

    public DogController(){
        dogService = new DogServiceImpl();
    }


    public void add(DogDTO dog){
        dogService.add(dog);
    }

    public int count(){
        return dogService.count();
    }

    public void show(){
        System.out.println("강아지의 수 : "+ dogService.count());
        System.out.println(dogService.show());
    }


    public String barking(String bark) {
        return dogService.barking(bark);
    }


    public String fetching(String target) {
        return dogService.fetching(target);
    }


    public String waggingTail() {
        return dogService.waggingTail();
    }
}



