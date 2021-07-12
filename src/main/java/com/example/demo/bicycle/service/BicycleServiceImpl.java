package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;

public class BicycleServiceImpl implements BicycleService{

    @Override
    public String information(BicycleDTO bi) {
        return bi.getCompany();
    }
}
