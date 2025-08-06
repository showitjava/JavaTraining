package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public  static  void  main(String ars[])
    {
        //Map<key,value> map = new HashMap<>();

        Map<String,Integer> map = new HashMap<>();

        map.put("Java",100);
        map.put("Python", 300);
        map.put("C++",500);

        for(Map.Entry<String,Integer> hm : map.entrySet())
        {
            System.out.print(hm.getKey() +": ");
            System.out.println(hm.getValue());
        }
    }
}
