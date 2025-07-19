package com.controlFlow;

public class DoWhileLoopDemo {

    public static  void main(String args[])
    {
        int i=1;

        //do-while loop
        do{
            System.out.println("First time do  while running!!");
            System.out.println(i);
            i++;
        }while(true);
    }
}
// & | ^ !  value1 & value2   6 ->110 &
//                            4-> 100
//                                100 -> 4
//                            6 ->110 |
//                            4-> 100
//                                110 ->6
// xor -> ^
//                            6 ->110 ^
//                            4-> 100
//                                010
//                            3 -> 011 ! ~
//                                 100
//