package com.example.demo.BankAccount.controller;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.BankAccount.service.BankAccountServiceImpl;
import com.example.demo.BankAccount.service.BankAccountService;
import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Random;
import java.util.Scanner;

public class BankAccountController {
    private BankAccountServiceImpl bankAccountService;
    public BankAccountController() {
        bankAccountService = new BankAccountServiceImpl();
    }
    public void main(){
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO account = null;
        while (true){
            System.out.println("[Menu] 0-Exit 1-계좌개설 2-계좌목록");
            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    account = new BankAccountDTO();
                    System.out.println("이름 : []");
                    account.setName(scanner.next());
                    bankAccountService.createAccount(account);
                    break;
                case "2" :
                    System.out.println("개설된 계좌 수: " +bankAccountService.count());
                    System.out.println(bankAccountService.findAll());
                case "3" : break;
                case "4" : break;
                case "5" : break;
                case "6" : break;
            }
        }
    }

}

   /* String accNumber;   // 계좌번호
    String ssNumebr;    // 주민번호
    int balance = 0;    // 예금 잔액

    // 초기화를 위한 메소드
    public void initAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumebr = ss;
        balance = bal;  // 계좌 개설 시 예금액으로 초기화
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumebr);
        System.out.println("잔 액: " + balance + '\n');
        return balance;
    }*/