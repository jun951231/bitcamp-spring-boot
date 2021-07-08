package com.example.demo.dog.serivce;

import com.example.demo.dog.domain.DogDTO;

//barking, fetching, wagging tail
public interface DogService {

    String name(DogDTO dog);
    String color(DogDTO dog);
    String breed(DogDTO dog);
    String hungry(DogDTO dog);
    String kind(DogDTO dog);

}
