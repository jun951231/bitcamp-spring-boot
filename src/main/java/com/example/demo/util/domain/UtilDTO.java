package com.example.demo.util.domain;


import java.time.LocalDate;
import java.time.LocalTime;

public class UtilDTO {
    private LocalDate today;
    private LocalTime currenttime;

    public void setToday(LocalDate today){
        this.today = today;
    }
    public LocalDate getToday(){
        return this.today;
    }
    public void setCurrenttime(LocalTime now){
        this.currenttime = currenttime;
    }
    public LocalTime getCurrenttime(){
        return this.currenttime;
    }



}
