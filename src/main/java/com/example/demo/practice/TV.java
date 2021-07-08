package com.example.demo.practice;


//import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

class SmartTv extends Object{
    int number;

}


class TvControl {
    public static void main(String[] args){


        Tv lgTv = new Tv("LG");
        Tv sTv = new Tv("samsung");
        Tv hTv = new Tv("HP",2048);

       // System.out.println(hTv.toString());
        //hTv.sound();

        System.out.println(hTv.getCurrent_channel());
        //hTv.current_channel = 1111111111;
        hTv.setCurrent_channel(7);
        System.out.println(hTv.getCurrent_channel());
        System.out.println(hTv.resolution);

        int[] arr = hTv.getChannel();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            //Thread.sleep(500);
        }


        // TV 켜기
        // 볼륨 키우기
        // 채널 바꾸기
    }
}



class Tv extends Object {
    // 속성
    String model_name;
    int[] channel;
    private int current_channel;
    int resolution;
    boolean power;

    //int password;
    static void display(){

        System.out.println("화면전시....");
    }


    Tv(String tv_name){
        model_name = tv_name;
        resolution = 1024;
        power = false;
        current_channel = 0;
        channel = new int[100];

        for (int i = 0; i < channel.length; i++){
            channel[i] = i + 1;
        }

        /*
        반복
         for
            횟수에 대한 반복
         while(true){
            특정 조건에 대한 반복

        channel[0] = 1;
        channel[1] = 2;
        channel[2]
        channel[3]
        channel[4]
        .
        .
        channel[0]
        channel[99]

         */
    }

    Tv(String tv_name, int resoulution) {
        model_name = tv_name;
        this.resolution = resolution;
        power = false;
        current_channel = 0;
        channel = new int[100];
        for (int i = 0; i < channel.length; i++) {
            channel[i] = i + 1;
        }
    }


    //Getter Setter

    public int[] getChannel() {
        return channel;
    }

    public void setChannel(int[] channel) {
        this.channel = channel;
    }

    public int getCurrent_channel() {
        return current_channel;
    }

    public void setCurrent_channel(int current_channel) {
        if(current_channel > 100){
            System.out.println("입력오류: 없는 채널입니다.");
        } else {
            this.current_channel = current_channel;
        }
    }

    //public Tv() { }


    // 기능


    //@Override
    public String sound(){

        return "오버라이딩 매서드";
    }
}
