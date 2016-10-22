package com.example.hello;

import java.util.Scanner;

/**
 * Created by fachrudin on 10/20/16.
 */

public class Bintang2Example {
    public static void main(String args[]) {
        int i,j;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer number: ");
        int num = input.nextInt();

        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++){
                System.out.print("x");
            }
            System.out.println();
        }
        for(i=num-1;i>=1;i--)
        {
            for(j=1;j<=i;j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
