package com.controlFlow;

import java.util.Scanner;

public class SwitchCaseDemo {

    public  static  void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Please choose the opertation 1: for Addtion , 2: Subtraction, 3: multiplication, 4: Division");
        int choice = sc.nextInt();
        int v;

        switch (choice)
        {
            case 1: System.out.println("We are doing addition here!!");
                    break;

            case 2: System.out.println(" we are subtraction here!!");
                     break;
            case 3: System.out.println("multiplication");
                    break;

            case 4: System.out.println(" Division!!");
                     break;
            default:System.out.println("Its a default case!!");
        }
    }
}// 3 3 4 5
