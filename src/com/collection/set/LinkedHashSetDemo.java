package com.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String args[])
    {
        Set<Integer>  set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(100);
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
