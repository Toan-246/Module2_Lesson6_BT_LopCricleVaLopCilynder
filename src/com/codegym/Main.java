package com.codegym;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        circle1 = new Circle(5, "Blue");
        System.out.println(circle1);

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        cylinder1 = new Cylinder(10.0);
        System.out.println(cylinder1);

        cylinder1 = new Cylinder(5, "red" , 5);
        System.out.println(cylinder1);
    }
}
