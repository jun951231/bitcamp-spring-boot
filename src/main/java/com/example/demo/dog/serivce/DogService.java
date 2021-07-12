package com.example.demo.dog.serivce;

import com.example.demo.dog.domain.DogDTO;

//barking, fetching, wagging tail
public interface DogService {

    String barking (String bark);
    String fetching (String target);
    String waggingTail();


}
