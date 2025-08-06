package com.collection.set;

import com.classes.abstraction.InterfaceDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {


    public static void  main(String args[])
    {
        Set<Integer>  set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(50);

        Iterator itr = set.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
