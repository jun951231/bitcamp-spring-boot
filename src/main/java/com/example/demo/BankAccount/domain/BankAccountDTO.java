package com.example.demo.BankAccount.domain;

import lombok.Data;

@Data
public class BankAccountDTO {
    private String name;
    private String accountNumber;
    private int money;
    public static final String Bank_Name = "비트은행";
    private String date;
    private float interest;
}

