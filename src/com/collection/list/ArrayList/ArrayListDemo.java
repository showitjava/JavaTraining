package com.collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String agrs[])
    {
        int [] arr = new int[10];

        arr[0] =100;
       // arr[1] ="Abc";


        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayListString = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(800);
        arrayList.add(500);
        arrayList.add(400);
        arrayList.add(700);
        arrayListString.add("Java");
        arrayListString.add("Apple");
       // arrayList.add(new Object());

        //int a =(Integer)arrayList.get(2);//
        ArrayList<Integer> arrList2 = new ArrayList<>();
        arrList2.addAll(arrayList); //object.addAll(Colleciton)
        System.out.println(arrList2.isEmpty()); //true

        System.out.println(arrList2.get(1));

        Iterator itr = arrList2.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Printing value using for Each loop!!");
        for(Integer value : arrList2)
        {
            System.out.println(value);
        }

        Collections.sort(arrList2);
        System.out.println("Printing value using normal for loop!!");
        for(Integer i = 0;i<arrList2.size();i++)
        {
            System.out.println(arrList2.get(i));
        }
    }
}
