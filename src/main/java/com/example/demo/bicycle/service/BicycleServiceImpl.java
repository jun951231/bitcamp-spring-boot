package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class BicycleServiceImpl implements BicycleService{
    private BicycleDTO bicycle;
    private ArrayList<BicycleDTO> bicycles;

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
    public String changingGear(String gear) {
        return bicycle.toString()+ gear + "기어";
    }

    @Override
    public String changingPedalCadence(String pedal) {
        return bicycle.toString()+ pedal + "페달";
    }

    @Override
    public String applyingBrakes() {
        return "브레이크";
    }

}
