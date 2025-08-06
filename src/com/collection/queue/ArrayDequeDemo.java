package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeDemo {

    public static void main(String ars[])
    {
        Deque<String> deque = new ArrayDeque<>();
        Deque<String> dequeLL = new LinkedList<>();

        deque.add("Java");
        deque.add("Html");
        deque.add("Css");
        deque.add("React");

        dequeLL.addAll(deque);

        System.out.println(dequeLL.peek());
        System.out.println(dequeLL.poll());
        System.out.println(dequeLL.peek());
        System.out.println(dequeLL.pop());
        // list ->



    }
}
