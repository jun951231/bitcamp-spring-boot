package com.example.demo.BankAccount.domain;

import lombok.Data;

@Data
public class BankAccountDTO {
    private String name;
    private String accountNumber;
    private int money;
    private int balance;
    private String date;
    private float interest;
    public static final String Bank_Name = "비트은행";

    @Override
    public String toString(){
        return String.format("이름 : %s, 계좌번호 : %s, 입금 : %d 원, 잔액 : %d 원," +
                " 날짜 : %s, 이자 : %d 원, 은행이름 : 비트은행 \n", name, accountNumber, money, balance,
                date, interest, Bank_Name);
    }

}

