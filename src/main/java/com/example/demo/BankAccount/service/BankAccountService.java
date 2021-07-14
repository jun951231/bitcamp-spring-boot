package com.example.demo.BankAccount.service;
/**
 * * 은행이름은 상수로 정한다
 * 이름을 입력하면 계좌가 생성된다. 단 계좌번호는 ****-****-**** 이고 랜덤값이다.
 금액, 계좌번호를 입력한 후 입금한 후 잔액을 확인한다
 금액, 계좌번호를 입력한 후 출금한 후 잔액을 확인한다
 금액, 계좌번호를 입력한 후 잔액을 확인하면 잔액이 보인다
 이름, 계좌번호를 입력한 후 계좌를 해지한다


 * */

import com.example.demo.BankAccount.domain.BankAccountDTO;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.List;

public interface BankAccountService {

    void createAccount(BankAccountDTO bank);
    int count();
    List<?> findAll();
    String[] findAllAccountNumber();
    int findBalance(BankAccountDTO bank);
    int deposit(BankAccountDTO bank);
    int withdraw(BankAccountDTO bank);
    void dropAccount(BankAccountDTO bank);


}
