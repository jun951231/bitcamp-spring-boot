package com.example.demo.BankAccount.domain;

import lombok.Data;

@Data
public class AccountDTO {

    private String name;
    private String accountNumber;
    private String money;
    private String balance;
    private String date;
    private String interest;
    public static final String Bank_Name = "비트은행";

    @Override
    public String toString(){
        return Bank_Name + " : " +
                "예금주=' " + name + '\'' +
                ", 계좌번호=' " + accountNumber + '\'' +
                ", 잔고=" + balance +
                ", 거래일자=' " + date + '\'' +
                ", 이자율=" + interest + "\n";
    }

}

