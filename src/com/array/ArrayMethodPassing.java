package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodPassing {

    public static  void main(String [] args)
    {
        int a[] ={10,20,4,58,100};
        double [] d = new double[10];
        d[1] =10.1;
        //a[2] =10.1; -> error

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array size");
        int size =sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Please enter arrays value");
        for(int i = 0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }


        int []result =min(arr);
        System.out.println("Sorted Values:");
        for(int r : result)
        {
            System.out.print(r + " ");
        }
    }

    public static int[] min(int arr[])
    {
        // arr => 10,20,4,58,100 // 1, 1 1, 3 3
        Arrays.sort(arr);
        int min =arr[0]; // 10
        for(int i= 1;i<arr.length; i++)
        {
            if(min > arr[i])  //4>100
            {
                min = arr[i];
            }
        }
        return arr;
    }
}
