package com.example.demo.dog.serivce;


import com.example.demo.dog.domain.DogDTO;

import java.util.List;

//barking, fetching, wagging tail
public interface DogService {

    void add(DogDTO dog);
    int count();
    List<?> show();
    String barking (String bark);
    String fetching (String target);
    String waggingTail();


}
