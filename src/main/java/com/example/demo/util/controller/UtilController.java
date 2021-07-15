package com.example.demo.util.controller;

import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class UtilController extends LambdaUtils {

    private UtilService utilService;

    public UtilController(){
        this.utilService = new UtilServiceImpl();

    }

        public void main(){
            Scanner scanner = new Scanner(System.in);
            while (true){
                print.accept("[메뉴] 0-종료 1-현재 날짜, 시간");
                switch (scanner.next()){
                    case "0" : return;
                    case "1" : print.accept(utilService.todayAndCurrenttime());
                    break;

                }
            }
        }
}
