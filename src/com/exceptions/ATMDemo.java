package com.exceptions;

import java.awt.*;
import java.util.Scanner;

public class ATMDemo {
    static int account_balance =1000;  //throw

    public  static  void main(String agrs[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdrawal!!");
        int amount= sc.nextInt(); //100

        try
        {
            withdrawal(amount);
        } catch (RuntimeException e) {
           System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally called!!");
        }

        System.out.println("Rest of your code works fine");

    }

    private static void withdrawal(int amount) {


        if(account_balance<amount) // 1000  < 2000
        {
            throw  new RuntimeException("Withdrawal amount should be less than account balance!!");
        }

        account_balance -=amount;

        System.out.println("Transaction successfully completed!!");
        System.out.println("Amount left :" +account_balance);
    }
}
