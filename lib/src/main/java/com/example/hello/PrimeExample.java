package com.example.hello;

import java.util.Scanner;

/**
 * Created by fachrudin on 10/18/16.
 */

public class PrimeExample {
    public static void main(String[] args) {

        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan sebuah bilangan: ");
        int bil = masukan.nextInt();

        boolean prima = true;
        for (int i = 2; i < bil; i++) {

            if ((bil % i) == 0) {
                prima = false;
                break;
            }
        }
        if (prima)
            System.out.println(bil + " bilangan PRIMA ");
        else
            System.out.println(bil + " bukan bilangan PRIMA ");

    }
}
