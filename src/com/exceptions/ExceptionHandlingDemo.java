package com.exceptions;

import com.operators.ArthmeticOprDemo;

import java.util.Scanner;

public class ExceptionHandlingDemo {

    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int value1 =sc.nextInt();// InputMismatchException A
        int value2 = sc.nextInt();

       System.out.println( computeDivision(value1,value2));
       System.out.println("Running proper flow!");
    }

    private static double computeDivision(int value1, int value2) {

        double result =0 ;
        try {
            System.out.println("Before division!!");
             result = value1 / value2;
             //int val= "124";
             System.out.println("After division!!");
             return 0;
        } catch (ArithmeticException e) {
           System.out.println("you are trying to divided by zero!!");
        }
        finally {
            System.out.println("It always execute!!!");
           // file.close();
        }

        return result;
    }
}
//stack trace