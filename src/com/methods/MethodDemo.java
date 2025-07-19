package com.methods;

public class MethodDemo {

    public  static void myMethod()
    {
        System.out.println("I just created new method!!");
    }
    public  static void myMethod2(char a, int b)
    {
        System.out.println("Value  of a: "+ a);
        System.out.println("Value  of b: "+ b);
    }

    public static void main(String ars[])
    {
        System.out.println("creating methods !!");
        myMethod();
        char a ='A';
        int b =10;
        myMethod2(a,b);


        System.out.println("returned form new methods !!");



    }
}
