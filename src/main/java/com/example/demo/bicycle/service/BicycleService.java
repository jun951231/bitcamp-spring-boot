package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;

import java.util.List;

public interface BicycleService {

    void add(BicycleDTO bicycle);
    int count();
    List<BicycleDTO> show();
    void changingGear();
    void changingPedalCadence();
    void applyingBrakes();

}
