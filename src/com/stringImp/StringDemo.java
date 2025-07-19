package com.stringImp;

public class StringDemo {

    public static void main(String args[])
    {
        String str ="Hello!!";
        String str1 = str;
        str= "Welcome!!";// ['W','e','l','c','o','m','e']
        String str2 = new String("hiiii!");

        int len = str.length();
         char ch = str.charAt(2);// l
        int ind = str.indexOf('l');
        String sub_str = str.substring(2);
        String sub_str1 = str.substring(2,4);

        String con_str = str.concat(str1);


        System.out.println("Length of string :"+len);
        System.out.println(str); // h  w
        System.out.println(ch);// l
        System.out.println(sub_str);// 2
        System.out.println(sub_str1);// 2  txn -> order id -> txn bran, date , uniw -> order  ->  10((2, 3, 2, 3)
        System.out.println(con_str);

    }
}
