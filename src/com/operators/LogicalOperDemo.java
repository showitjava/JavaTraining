package com.operators;

public class LogicalOperDemo {

    public  static void main(String [] agrs)
    {
        int a =10;
        int b= 5;
        int c =20;

        // And operator &&

       /*if( (a<b) &&  (a<c)) // a<b false  -> false && anyting -> false ....  ture && other relation
       {
           System.out.println("whole statement is true : "+ (a>b) +" " + (a< c));
       }
       else{
           System.out.println("Not true!!");
       }*/

        //or operator ||
        /*if( !(a<b) ||  (a<c)) // a<b false  -> true && anyting -> true ....  false && check other condition
        {
            System.out.println("whole statement is true : "+ (a<b) +" " + (a< c));
        }
        else{
            System.out.println("Not true!!");
        }*/

        //not logical
        if( !(a<b)) // !false -> true  or !true = false
        {
            System.out.println("whole statement is true : "+ (a<b) );
        }
        else{
            System.out.println("Not true!!");
        }

    }
}
