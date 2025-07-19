package com.Practice;

public class DatatypePractice {

    public static  void  main(String [] args)
    {
        int a = 5; //5
        int b = a++ + ++a - --a;// 5 + 5 - 4
        System.out.println(b);
        byte x = 15;
        // check if it is odd or not
        int mask =  1<<2;
        int xx = x ^ mask ; //1111
          System.out.println(xx);


    }
}

