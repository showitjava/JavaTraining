package com.classes.poly;

public class Overloading {

    public static void main(String args[])
    {
        //Scanner
        sumOfNumbers(1,2);
        sumOfNumbers(1,2,3.9);
        sumOfNumbers(1.1,2.9);

    }

    public  static void sumOfNumbers(int a, int b)
    {
        System.out.println("Summing two numbers " + (a+b));
    }
    public  static void sumOfNumbers(int a , int b, int c)
    {
        System.out.println("Summing three  numbers " + (a+b+c));
    }
    public  static void sumOfNumbers(double a, double b)
    {
        System.out.println("Summing two decimal numbers " + (a+b));//4.0
    }
    public  static void sumOfNumbers(int a, int b, double c)
    {
        System.out.println("Summing two decimal numbers " + (int)(a+b+c));//1+2+3.9
    }

}


