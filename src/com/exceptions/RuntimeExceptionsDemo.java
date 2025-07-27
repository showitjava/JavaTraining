package com.exceptions;

public class RuntimeExceptionsDemo {

    public  static void main(String args[])
    {
        // throw and throws

        String name =null;
       if(name ==null) {
           throw new RuntimeException("string should not be null!!");
       }
        /*try {
            int len = name.length();
        } catch (RuntimeException e) {
            System.out.println("catching the exceptions");
        }*/
    }
}
