package com.controlFlow;

public class WhileLoopDemo {

    public  static void main(String [] args)
    {
        int i =0;
        int a =10;
        int b=5;
        int c=3;
        while ((a>b) && (b>c))
        {
            System.out.println(a +" ");
            System.out.println("Before break");
            if(a<8)
            {
                a--;
                continue;
                //break;
                //System.out.println("after break");
            }
            System.out.println("after break");
            a--;
           //c++;
           // i+=3; // 0 3 5
        }
    }
}
