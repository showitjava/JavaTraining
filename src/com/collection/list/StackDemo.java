package com.collection.list;

import java.util.Stack;

public class StackDemo {

    public  static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>(); // LIFO   {{ ( )}} - // {)){{}}))()

        stack.push(100);
        stack.push(200);
        stack.push(300);

       System.out.println( stack.peek());

       System.out.println(stack.pop());

        System.out.println( stack.peek());

    }
}
