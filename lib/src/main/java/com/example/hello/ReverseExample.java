package com.example.hello;

import java.util.Scanner;

/**
 * Created by fachrudin on 10/20/16.
 */

public class ReverseExample {

    public static void main(String args[])
    {
        int num=0;
        int reversenum =0;
        System.out.println("Input your number and press enter: ");

        //input
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

      /* for loop: No initialization part as num is already
       * initialized and no increment/decrement part as logic
       * num = num/10 already decrements the value of num
       */
        for( ;num != 0; )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of specified number is: "+reversenum);
    }
}
