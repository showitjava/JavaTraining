package com.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String agrs[])
    {
        Set<Integer> set = new TreeSet<>();

        set.add(200);
        set.add(1);
        set.add(500);
        set.add(30);
        set.add(60);
        set.add(50);
        set.add(50);
        set.add(60);

        Iterator itr  = set.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }


}
