package com.example.demo;

class Fiftyfifth {
    public static void main(String[] args) {

        int i = 1;
        // 합계 변수
        int sum = 0;

        while (i <= 100){
            //합계 변수에 i 누적
            sum = sum + i;
            //su+=i;로도 활용
            
            i++;
        }
        System.out.println("1부터 100까지의 합은" + sum + "이다.");
    }

}

class Fiftyfifth2 {
    public static void main(String[] args) {
        //합계를 담을 변수
        int sum=0;
        for(int i = 1; i<= 100; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지의 합은"+sum+ "이다.");
    }
}




