package com.classes;

public class ConstructorDemo {

    int value ;
    String name ;

    ConstructorDemo(){
        System.out.println("Default constructor");
    }

    ConstructorDemo(int i){
        System.out.println("1 param constructor");
    }


    ConstructorDemo(int value, String name)
    {
        this.value =value;
        this.name = name;

    }

    public void display()
    {
        System.out.println(value +" "+ name);
    }





}
