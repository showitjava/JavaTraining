package com.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {

    public static void main(String ars[]) {

        String str = "aaabbbdddccccddsse";
        // any number whose frequency is greater than 1 will be duplicate

        Map<Character, Integer> map = new HashMap<>();

        for (int itr = 0; itr < str.length(); itr++)
        {

                map.put(str.charAt(itr),map.getOrDefault(str.charAt(itr),0)+1);

        }
        for(Map.Entry<Character,Integer> m : map.entrySet())
        {
           if(m.getValue() >1)
           {
               System.out.println(m.getKey());
           }
        }


        // find all the numbers less than 10 in an arrayList
        List<Integer> list_arr = Arrays.asList(1,2,3,10,12,44,55,66);
        List<Integer> result = list_arr.stream()
                                        .filter(item-> item<10)
                                        .collect(Collectors.toList());

        for(int r:result)
        {
            System.out.println(r);
        }


    }

}
