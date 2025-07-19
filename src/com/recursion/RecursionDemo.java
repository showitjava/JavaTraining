package com.recursion;

public class RecursionDemo {

    public  static void main(String agrs[])
    {
        // sum of 5 natural numbers 1 -> n
        int sum =0;
        for(int  i=1;i<=5;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of 5 natural numbers :" + sum);
        int reuslt =sum_rec(5);

        System.out.println("Sum of 5 natural numbers :" + reuslt);
    }

    public static int sum_rec(int value)
    {
        if(value ==1)
        {
            return 1;
        }
        return value + sum_rec(value-1);
    }

}
