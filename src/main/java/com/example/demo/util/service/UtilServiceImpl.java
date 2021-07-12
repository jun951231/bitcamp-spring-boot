package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{

    @Override
    public String todayAndCurrenttime() {
        return String.format("%s %s", Today(), CurrentTime());
    }

    UtilDTO util = new UtilDTO();

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
