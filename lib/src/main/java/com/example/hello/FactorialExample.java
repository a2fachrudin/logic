package com.example.hello;

/**
 * Created by fachrudin on 10/17/16.
 */

public class FactorialExample{
    public static void main(String args[]){
        int i,fact=1;
        int number=5;//input number to calculate factorial
        for(i=1; i<=number; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}  