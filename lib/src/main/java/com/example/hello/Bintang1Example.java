package com.example.hello;

import java.util.Scanner;

/**
 * Created by fachrudin on 10/17/16.
 */

public class Bintang1Example {
    public static void main(String args[]) {
        int i,j;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer number: ");
        int num = input.nextInt();

        //for(i=num;i>=num;i++) reverse
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++){
                System.out.print("x");
            }
            System.out.println(); //next row
        }
    }
}
