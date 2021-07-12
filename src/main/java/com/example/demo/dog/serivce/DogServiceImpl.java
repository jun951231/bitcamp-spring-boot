package com.example.demo.dog.serivce;

import com.example.demo.dog.domain.DogDTO;

public class DogServiceImpl implements DogService {


    @Override
    public String info(DogDTO dog) {
        return dog.getColor() + dog.getBreed();
    }
}