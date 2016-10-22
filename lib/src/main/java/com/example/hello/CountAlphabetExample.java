package com.example.hello;

import java.util.Scanner;

/**
 * Created by fachrudin on 10/16/16.
 */

public class CountAlphabetExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kata : ");
        String kata = input.nextLine();

        System.out.println("Jumlah Kata   : "+kata.length());
    }
}
