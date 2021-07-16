package com.example.demo.BankAccount.controller;

import com.example.demo.BankAccount.domain.AccountDTO;
import com.example.demo.BankAccount.service.BankService;
import com.example.demo.BankAccount.service.BankServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BankController extends LambdaUtils{

    private BankService bankService;
    public BankController(){
        bankService = new BankServiceImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        AccountDTO account = null;
        while(true){
            System.out.println("[MENU] 0-Exit 1-계좌개설 2-계좌목록 3-계좌번호목록 \n" + "4-잔고확인 5-입금 6-출금");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    account = new AccountDTO();
                    print.accept("이름: ");
                    account.setName(scanner.next());
                    bankService.createAccount(account);
                    break;
                case "2":
                    print.accept("개설된 계좌 수: "+bankService.count());
                    List<? extends AccountDTO> list = bankService.findAll();
                    for(AccountDTO a: list){
                        print.accept(a.toString());
                    }
                    break;
                case "3":
                    for(String s: bankService.findAllAccountNumbers()){
                        print.accept(s + "\n");
                    }
                    break;
                case "4":
                    print.accept("잔고 조회할 계좌번호 : ");
                    print.accept(bankService.findBalanceByAccountNumber(scanner.next()));
                    break;
                case "5":
                    print.accept("입금 할 계좌번호 : ");
                    account = new AccountDTO();
                    account.setAccountNumber(scanner.next());
                    print.accept("입금액 : ");
                    account.setMoney(scanner.next());
                    bankService.deposit(account);
                    break;
                case "6":
                    print.accept("출금 할 계좌번호 : ");
                    account = new AccountDTO();
                    account.setAccountNumber(scanner.next());
                    print.accept("출금액 : ");
                    account.setMoney(scanner.next());
                    bankService.withdraw(account);
                    break;



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
    }

    print.accept("[Menu] 0-Exit 1-계좌개설 2-계좌목록 3-계좌번호목록 4-입금");
            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    account = new AccountDTO();
                    print.accept("예금주");
                    account.setName(scanner.next());
                    print.accept("계좌번호");
                    account.setAccountNumber(scanner.next());
                    print.accept("잔고");
                    account.setBalance(scanner.next());
                    print.accept("거래일자");
                    account.setDate(scanner.next());
                    print.accept("이자율");
                    account.setInterest(scanner.next());
                    bankAccountService.createAccount(account);
                    break;
                case "2" :
                    print.accept(string.apply(bankAccountService.count()));
                    break;
                case "3" :
                    List<AccountDTO> list= (List<AccountDTO>) bankAccountService.findAll();
                    for(AccountDTO b: list) {
                        print.accept(b.toString());
                    }
                    break;
                case "4" :
                    print.accept("계좌번호 : [  ]");
                    account = new AccountDTO();
                    account.setAccountNumber(scanner.next());
                    print.accept("입금액 : [   ]");
                    account.setMoney(scanner.next());

                    break;
                case "5" : break;
                case "6" : break;
    */