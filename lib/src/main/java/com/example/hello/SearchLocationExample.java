package com.example.hello;

import java.util.Scanner;

/**
 * Created by fachrudin on 10/18/16.
 */

public class SearchLocationExample {

    public static void main(String args[])
    {
        int counter, num, item, array[];

        Scanner input = new Scanner(System.in); //To capture user input
        System.out.println("Enter number of elements:");
        num = input.nextInt();

        array = new int[num]; //Creating array to store the all the numbers
        System.out.println("Enter " + num + " integers");

        //Loop to store each numbers in array
        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.println("Enter the search value:");
        item = input.nextInt();

        for (counter = 0; counter < num; counter++){
            if (array[counter] == item){
                System.out.println(item+" is present at location "+(counter+1));
           /*Item is found so to stop the search and to come out of the
            * loop use break statement.*/
                break;
            }
        }
        if (counter == num)
            System.out.println(item + " doesn't exist in array.");
    }
}
