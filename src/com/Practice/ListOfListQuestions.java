package com.Practice;

import java.util.Arrays;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfListQuestions {

    public  static void  main(String args[])
    {
        List<List<String>>  skills = Arrays.asList(
                Arrays.asList("Java","Spring","SpringBoot"),
                Arrays.asList("React","Angular","JavaScript"),
                Arrays.asList("MySql","PostgreSQL","Oracle")
        );
        //how to
        //lambda expression works on functional interface 0->
        Predicate  p = (a)-> {return  false;};
        p.test(10);

            AddNumers sum = (a,b)->{ return  (a+b);};

            sum.add(10,20);

        // convert it to single list
        List<String> l = skills.stream()
                                .flatMap(list->list.stream())
                .collect(Collectors.toList());

        for(String s: l)
        {
            System.out.println(s+ " ");
        }
    }
}
@FunctionalInterface
interface AddNumers{
        int add(int a, int b);
}
