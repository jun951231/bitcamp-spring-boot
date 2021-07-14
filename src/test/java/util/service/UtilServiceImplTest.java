package util.service;

import java.util.Random;

public class UtilServiceImplTest {
    public static void main(String[] args){
        Random random = new Random();
        String result = "";
        for (int i = 0; i<4; i++){
            result += (int) (Math.random() * 10);
        }

        System.out.println(result);

    }
}


