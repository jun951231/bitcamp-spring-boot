package com.example.demo.BankAccount.service;

import com.example.demo.BankAccount.controller.BankAccountController;
import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.dog.domain.DogDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class BankAccountServiceImpl implements BankAccountService{
   private BankAccountDTO bankAccount;
   private List<BankAccountDTO> bankAccounts;

   @Override
   public int count() {
      return bankAccount.getMoney();
   }

   @Override
   public List<?> findAll() {
      return bankAccounts;
   }

   @Override
   public String[] findAllAccountNumber() {
      String[] accountNumbers = new String[count()];
      for(int i = 0; i< accountNumbers.length; i++){
      
      }
      return new String[0];
   }

   public  BankAccountServiceImpl(){
      bankAccount = new BankAccountDTO();
      bankAccounts = new ArrayList<>();
   }
   @Override
   public void createAccount(BankAccountDTO bank) {
      UtilService utilService = new UtilServiceImpl();
      //if(){}
      String accountNumber = utilService.randomNumbers(4, false) + "-" +
            utilService.randomNumbers(4, true)+ "-" +
            utilService.randomNumbers(4, true);
      bank.setAccountNumber("");
      bankAccounts.add(bank);
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
      return 0;
   }

   @Override
   public void dropAccount(BankAccountDTO bank) {

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
