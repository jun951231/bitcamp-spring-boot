package com.example.demo;

class Pyramid {
    public static void main(String[] args){
        int i;
        int j;
        int k;
        int num = 20;

        for (i=0; i<num; i++) {
            for (j = 1; j < num-i; j++) {
                System.out.print(" ");//공백
            }

            for (k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");//별표//
            }
            System.out.println();
        }
    }
}



