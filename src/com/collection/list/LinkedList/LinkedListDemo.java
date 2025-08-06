package com.collection.list.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String [] agrsStrings){
        LinkedList<Integer>  ll = new LinkedList<>();

        //add()
        //addAll()
        ll.add(100);
        ll.add(200);
        ll.add(500);
        ll.add(900);

        ArrayList<String>  programming_lang = new ArrayList<>();
        programming_lang.add("Java");
        programming_lang.add("C");
        programming_lang.add("Python");

        LinkedList<String> ll2 = new LinkedList<>();

        ll2.addAll(programming_lang);

        System.out.println(ll.get(1));
        System.out.println(ll2.get(0)); //O(n)  O(1)

        Iterator itr = ll.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ll.addFirst(10000); //O(1)
        ll.addLast(700); // O(n)

        Iterator itr1 = ll.iterator();


        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        System.out.println(ll2.getFirst());
        System.out.println(ll2.getLast());
    }
}
