package com.example.demo.bicycle.domain;

public class BicycleDTO {
    private String gear;
    private String company;
    private int speed;

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getGear() {
        return this.gear;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return String.format("기어는 %s, 회사는 %s, 속도는 %d.", gear, company, speed);
    }
}
