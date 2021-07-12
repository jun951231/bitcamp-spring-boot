package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.domain.BankAccountDTO;

public class BankAccountServiceImpl implements BankAccountService{
   private BankAccountDTO bankAccount;



   @Override
   public void createAccount(BankAccountDTO bank) {
      bankAccount = new BankAccountDTO();
      String randomNumber = "";
      bankAccount.setAccountNumber(randomNumber);
      bankAccount.setName(bank.getName());
   }

   @Override
   public int findBalance(BankAccountDTO bank) {
      return bankAccount.getMoney();
   }

   @Override
   public int deposit(BankAccountDTO bank) {
      int restMoney = bankAccount.getMoney();
      bankAccount.setMoney(restMoney + bank.getMoney());
      return bankAccount.getMoney();
   }

   @Override
   public int withdraw(BankAccountDTO bank) {
      int restMoney = bankAccount.getMoney();
      bankAccount.setMoney(restMoney + bank.getMoney());
      return bankAccount.getMoney();
   }

   @Override
   public void dropAccount(BankAccountDTO bank) {
      bankAccount = new BankAccountDTO();

   }
}


/*
 int balance = 0; // 예금 잔액

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
* */
