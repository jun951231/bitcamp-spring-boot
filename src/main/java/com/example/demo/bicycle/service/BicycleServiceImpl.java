package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class BicycleServiceImpl implements BicycleService{
    private final BicycleDTO bicycle;
    private final List<BicycleDTO> bicycles;

    public BicycleServiceImpl(){
        bicycle= new BicycleDTO();
        bicycles = new ArrayList<>();
    }

    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);

    }

    @Override
    public int count() {
        return bicycles.size();
    }

    @Override
    public List<BicycleDTO> show() {
        return bicycles;
    }

    @Override
    public void changingGear() {

    }

    @Override
    public void changingPedalCadence() {

    }

    @Override
    public void applyingBrakes() {

    }

}
