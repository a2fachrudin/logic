package com.example.hello;

import java.util.Scanner;

/**
 * Created by fachrudin on 10/20/16.
 */

public class Bintang3Example {
    public static void main(String args[]) {
        int i,j,k;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer number: ");
        int num = input.nextInt();

        for(i=1;i<=num;i+=2)
        {
            for(j=num;j>i;j--){
                System.out.print("");
            }
            for(k=1;k<=i;k++){
                System.out.print("x");
            }
            System.out.println();
        }

        for(i=num-2;i>=1;i-=2)
        {
            for(j=i;j<num;j++){
                System.out.print("");
            }
            for(k=1;k<i+1;k++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
