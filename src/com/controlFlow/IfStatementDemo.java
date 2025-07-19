package com.controlFlow;

public class IfStatementDemo {
    public  static void main(String agrs[]) {


       /* if(condition) //true
        {
            adsf
        }
        else{
           trew
        }*/
        int x= 10;
        int y =20;

        /*if(x<y)
        {
            System.out.println("X is smaller value!!");
        }
        if(x>y)
        {
            System.out.println(x);
        }
        else{
            System.out.println("Y is greater than X");
        }*/

        if(x<y)
        {
            System.out.println("X is smaller value!!");
        }
        else if(x<y)
        {
            System.out.println(x);
        }
        else{
            System.out.println("Y is greater than X");
        }
    }
}
