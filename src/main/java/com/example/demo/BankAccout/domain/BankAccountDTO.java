package com.example.demo.BankAccout.domain;

public class BankAccountDTO {
    int balance = 0; // 예금 잔액

    public BankAccountDTO(){
        System.out.println("생성자 호출");
    }
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }//Function
    public int checkMyBalance(){
        System.out.println("잔액 : " + balance);
        return balance;
    }//Supplier
}

