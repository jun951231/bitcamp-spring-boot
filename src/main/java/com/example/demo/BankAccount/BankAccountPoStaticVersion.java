package com.example.demo;

class BankAccountPOStaticVersionS {
    static int balance = 0; //예금잔액

    public static void main(String[] args){

        //입금 진행
        deposit(/*amount*/ 10000);
        // 잔액 확인
        checkMyBalance();
        // 출금 진행
        withdraw(/*amount*/ 3000);
        //System.out.println(withdraw(/*amount*/ 3000));
        // 잔액 확인
        checkMyBalance();
    }

    private static void withdraw(int amount) {
        balance -= amount;
    }

    private static void checkMyBalance() {
        System.out.println("잔액: " + balance);
        // 잔액 확인
    }

    public static int deposit(int amount) {		// 입금을 담당하는 메소드
        balance += amount;
        return balance;
    }
    //public static int withdraw(int amount) {	// 출금을 담당하는 메소드
        //balance -= amount;
        //return balance;
    }

//}

