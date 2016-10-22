package com.example.hello;

/**
 * Created by fachrudin on 10/20/16.
 */

public class ProtectedExample {
    protected static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }
}
class pengakses{
    public static void main (String[] args) {
        ProtectedExample a=new ProtectedExample();
        System.out.println ("Hasil 3 kuadrat = "+a.kuadrat(3));
    }
}

