package com.example.demo.BankAccount.controller;

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.BankAccount.service.BankAccountServiceImpl;
import com.example.demo.BankAccount.service.BankAccountService;

import java.util.Random;
import java.util.Scanner;

public class BankAccountController{
    private BankAccountService bankAccountService;
    private BankAccountDTO bankAccount;
    private Scanner scanner;

    public BankAccountController(){
        this.bankAccountService = new BankAccountServiceImpl();
        this.bankAccount = new BankAccountDTO();
        this.scanner = new Scanner(System.in);
        Random rand = new Random();

        for (int i = 0; i<3; i++)
            System.out.println(rand.nextInt(10000));

    }
        public void main(){
        BankAccountDTO bankAccountDTO = new BankAccountDTO();
        System.out.println("이름을 입력하면 계좌가 생성된다");
        bankAccount.setName(scanner.next());
        System.out.println("금액, 계좌번호를 입력한 후 입금한 후 잔액을 확인한다. 단 계좌번호는 ****-****-**** 이고 랜덤값이다.");
        bankAccount.setMoney(scanner.nextInt());
        System.out.println("금액, 계좌번호를 입력한 후 출금한 후 잔액을 확인한다");
        bankAccount.setMoney(scanner.nextInt());
        System.out.println("금액, 계좌번호를 입력한 후 잔액을 확인하면 잔액이 보인다");
        bankAccount.setMoney(scanner.nextInt());
        System.out.println("이름, 계좌번호를 입력한 후 계좌를 해지한다");
        bankAccount.setName(scanner.next());
        System.out.print(bankAccount.toString());
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