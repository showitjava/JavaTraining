package com.exceptions;



public class ExceptionDemo {

    public  static void main(String args[])
    {
      //  Student s = new Student(); // checked exception


        int [] arr =new int[5];
        System.out.println("Before execute line no 13");
        System.out.println("Before execute line no 14");
        int res =100/0;
        System.out.println("Before execute line no 15");
        System.out.println("Before execute line no 16");
        arr[5]=10; //0 1 2 3 4 -> 5
        System.out.println("Before execute line no 16");

        System.out.println("Exception handling class");
    }
}
