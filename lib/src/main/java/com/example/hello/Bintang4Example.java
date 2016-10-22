package com.example.hello;

/**
 * Created by fachrudin on 10/19/16.
 */

public class Bintang4Example {
    public static void main(String [] args){
        int x=5;
        for (int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){ //spasi
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){ //bintang
                System.out.print("*");
            }
            for (int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
