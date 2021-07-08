package com.example.demo.dog.serivce;

import com.example.demo.dog.domain.DogDTO;

public class DogServiceImpl implements DogService {

    @Override
    public String name(DogDTO dog) {
        return null;
    }

    @Override
    public String color(DogDTO dog) {
        return null;
    }

    @Override
    public String breed(DogDTO dog) {
        return null;
    }

    @Override
    public String hungry(DogDTO dog) {
        return null;
    }

    @Override
    public String kind(DogDTO dog) {
        return dog.getColor() + dog.getBreed();
    }
}