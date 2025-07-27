package com.exceptions;

public class MultiTryCatchDemo {

    public static  void  main(String args[])
    {
        try {
            int a[] = new int[5];
            a[0] = 10;
            a[1] = 0;
            int reslut = a[0]/a[1];//
            a[6] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exp)
        {
            System.out.println("You are trying to access some other index from array!!");
        }
        catch (ArithmeticException exp)
        {

            System.out.println("divided by zero!!");
        }
        catch (Exception e)
        {
            System.out.println("Excption reaised!!");
        }
        finally {
            System.out.println("finally all exception are caught!!");
        }




    }
}
