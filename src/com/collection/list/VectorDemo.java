package com.collection.list;

import java.util.Vector;

public class VectorDemo {

    public  static  void main(String ars[])
    {
        Vector<String> v = new Vector<>();

        v.add("java");
        v.add("C++");
        v.add("Python");
        v.add("C#");
        v.add("Go");
        v.add("java");
        v.add("C++");
        v.add("Python");
        v.add("C#");
        v.add("Go");


        System.out.println(v.get(2));
        System.out.println(v.capacity());
        System.out.println(v.size());


    }
}
