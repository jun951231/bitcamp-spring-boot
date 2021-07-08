package com.example.demo.dog.domain;

//state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import java.util.Scanner;

public class DogDTO {
    private String name;
    private String color;
    private String breed;
    private String hungry;
    private String kind;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setHungry(String hungry){
        this.hungry = hungry;
    }
    public String getHungry(){
        return this.hungry;
    }
    public void setKind(String kind){ this.kind = kind; }
    public String getKind(){ return this.kind; }

    @Override
    public String toString(){
        return String.format ("이름은 %s, 색은 %s, 품종은 %s, 배고픔은 %s.", name, color, breed, hungry);
    }
}


