package com.example.demo.BankAccount.service;
/**
 * * 은행이름은 상수로 정한다
 * 이름을 입력하면 계좌가 생성된다. 단 계좌번호는 ****-****-**** 이고 랜덤값이다.
 금액, 계좌번호를 입력한 후 입금한 후 잔액을 확인한다
 금액, 계좌번호를 입력한 후 출금한 후 잔액을 확인한다
 금액, 계좌번호를 입력한 후 잔액을 확인하면 잔액이 보인다
 이름, 계좌번호를 입력한 후 계좌를 해지한다


 * */

import com.example.demo.BankAccount.domain.AccountDTO;

import java.util.List;

public interface BankService {

    void createAccount(AccountDTO bank);
    String count();
    List<? extends AccountDTO> findAll();
    String[] findAllAccountNumbers();
    AccountDTO findAccountByAccountNumber(String accountNumber);
    String findBalanceByAccountNumber(String accountnumber);
    void deposit(AccountDTO bank);
    void withdraw(AccountDTO bank);
    void dropAccount(AccountDTO bank);


}
