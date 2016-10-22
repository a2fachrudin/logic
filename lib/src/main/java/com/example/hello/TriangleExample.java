package com.example.hello;

import java.util.Scanner;

/**
 * Created by fachrudin on 10/18/16.
 */

public class TriangleExample {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        //alas
        System.out.println("Input Width: ");
        double base = scanner.nextDouble();

        //tinggi
        System.out.println("Input Width: ");
        double height = scanner.nextDouble();

        double area = (base*height)/2;
        System.out.println("Area of Triangle: "+ area);
    }
}
