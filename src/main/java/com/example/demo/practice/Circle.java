package com.example.demo;
class Circle {
        final double PI = 3.141592;
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        //기능
        public double area(double rad){
            double result = rad * rad * PI;
            return result;
        }
        public double area(Circle cir){
            double result = cir.radius * cir.radius * PI;
            return result;
        }
}
class BankAccountUniID2 {
    public static void main(String[] args){

        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(3.0);

        System.out.println(c1.area(c1));
    }
}