package com.example.demo.himart.controller;

import com.example.demo.BankAccount.domain.AccountDTO;
import com.example.demo.himart.domian.PhoneApp;
import com.example.demo.himart.service.HimartService;
import com.example.demo.himart.service.HimartServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Phaser;

public class HimartController extends LambdaUtils {
    private final HimartService himartService;
    public HimartController(){
        himartService = new HimartServiceImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        AccountDTO account = null;
        while (true) {
            System.out.println("[MENU] 0-Exit 1-스마트폰 구입 2- 3- \n" +
                    "4- 5- 6-");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    phoneMain(scanner);
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;


                }

            }
        }
        public void phoneMain(Scanner scanner){
            PhoneApp app = new PhoneApp();
            PhoneApp.Phone phone = null;
            PhoneApp.CelPhone celPhone = null;
            PhoneApp.IPhone iPhone = null;
            PhoneApp.GalaxyNote galaxyNote = null;
            while (true) {
                print.accept("[Menu] 0-종료 1-집전화 2-휴대폰 3-아이폰 4-갤럭시");
                switch (scanner.next()){
                    case "0":

                        return;
                    case "1":
                        phone = app.new Phone();
                        phone.setCall("집으로 전화");
                        phone.setCompany("금성");
                        phone.setCompany("집전화");
                        print.accept(phone.toString());
                        break;
                    case "2":
                        celPhone = app.new CelPhone();
                        celPhone.setCall("이동 중에 전화");
                        celPhone.setCompany("LG");
                        celPhone.setKind("초콜릿폰");
                        celPhone.setMove("이동");
                        celPhone.isPortable();
                        print.accept(celPhone.toString());
                        break;
                    case "3":
                        iPhone = app.new IPhone();
                        iPhone.setCall("아이폰으로 전화");
                        iPhone.setCompany("애플");
                        iPhone.setKind(PhoneApp.IPhone.BRAND);
                        iPhone.setMove("이동");
                        iPhone.setInternet("구글에 접속하다");
                        print.accept(iPhone.toString());
                        break;
                    case "4":
                        galaxyNote = app.new GalaxyNote();
                        galaxyNote.setCall("갤럭시노트로 전화");
                        galaxyNote.setCompany("삼성");
                        galaxyNote.setKind(PhoneApp.GalaxyNote.BRAND);
                        galaxyNote.setMove("이동");
                        galaxyNote.setInternet("네이버에 접속하다");
                        galaxyNote.setPencil("노트펜슬 사용");
                        print.accept(galaxyNote.toString());
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

