package com.example.demo.BankAccount.controller;

class BankAccountController2 {
    String accNumber;   // 계좌번호
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
    }
}
