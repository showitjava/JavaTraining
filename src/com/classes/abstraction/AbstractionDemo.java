package com.classes.abstraction;

public abstract class AbstractionDemo {

    String name ;

    public  abstract double area(int l, int b);
    public void display()
    {
        System.out.println("Pritting area!");
    }

}

class Shape extends AbstractionDemo{

    @Override
    public double area(int l , int b) {
        return l*b;
    }
}

// you are not able to create object of abstract class

/// payment -> Credit card Debit card , internetbanking
// class abstract Payment{
//             public abstract void pay();
/*arr ={10,2,3};
for(int i: arrr) // i =1
        {
            sum+= i;
            System.out.println(i); // 2 arr[10]
        }*/
