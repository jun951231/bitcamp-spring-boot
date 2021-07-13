package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.controller.BankAccountController;
import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.dog.domain.DogDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class BankAccountServiceImpl implements BankAccountService{
   private BankAccountDTO bankAccount;
   private ArrayList<BankAccountDTO> bankAccounts;

   public BankAccountServiceImpl(){
      bankAccount = new BankAccountDTO();
      bankAccounts = new ArrayList<>();
   }

   @Override
   public void add(BankAccountDTO bankAccount) {
      bankAccounts.add(bankAccount);
   }

   @Override
   public int count() {
      return bankAccounts.size();
   }

   @Override
   public List<BankAccountDTO> show() {
      return bankAccounts;
   }

   @Override
   public String createAccount(String bank) {
      return bankAccount.toString() + bank + "은행";
   }

   @Override
   public int findBalance(int bank) {
      return bankAccount.setBalance() + bank + "잔액";
   }

   @Override
   public int deposit(int bank) {
      return bankAccount.setMoney() + bank + "";
   }

   @Override
   public int withdraw(int bank) {
      return 0;
   }

   @Override
   public String dropAccount(String bank) {

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
