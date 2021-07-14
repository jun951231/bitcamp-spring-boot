package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class UtilServiceImpl implements UtilService{

    @Override
    public String randomNumbers(int digits, boolean allowZeroValue) {
        // Math.random() 클래스 메소드
        // Random random = new Random()
        // random.nextInt(1000); 인스턴스 메소드
        String first = "", result = "";
        first += allowZeroValue ? ((int) (Math.random() * 10)) : ((int) (Math.random() * 9 + 1));
        for (int i = 0; i<digits-1; i++){
            result += (int) (Math.random() * 10);
        }
        return first + result;
    }

    private UtilDTO util;

    public UtilServiceImpl(){
        this.util = new UtilDTO();
    }

    @Override
    public String todayAndCurrenttime() {
        return String.format("%s %s", Today(), CurrentTime());
    }


    @Override
    public LocalDate Today() {
        util.setToday(LocalDate.now());
        return util.getToday();
    }

    @Override
    public LocalTime CurrentTime() {
        util.setCurrenttime(LocalTime.now());
        return util.getCurrenttime();
    }
}
