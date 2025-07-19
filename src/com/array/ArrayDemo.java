package com.array;

import java.awt.*;
import java.util.Scanner;

public class ArrayDemo {

    public static  void main(String args[])
    {
        // data_type [] arr = new data_type[size] ;
        // boolean [] b = new boolean[10];
        // int [] arr = new int[5];
        // arr -> base address store arr[2] -> base address + 2(data_type size)
        Scanner sc  = new Scanner(System.in);

        //int size = sc.nextInt();
        int [] arr = new int[100]; // {10,20,0,0,0} [0-4]
        char [] ch = new char[5];
        int []a= {100,200,300};

        ch[0] ='A';
        ch[1] ='B';


        arr[0]=10;
        arr[1]=20;
        //arr[5]=200;
      /*  System.out.println(arr[1]);
        System.out.println(ch[2]);*/

      /*  for(int i =0;i<a.length; i++)
        {
            System.out.println(a[i] );
        }*/
        // for -each ->
        // for(data_type name_of_variables : collecitonOfElements)
        for(int item : arr)
        {
            System.out.println(item ); // time complexity ->  O(n) -> O(1) -> storing value arr[10]-> 100
        }

    }
}
