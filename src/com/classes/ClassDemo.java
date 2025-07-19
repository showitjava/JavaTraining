package com.classes;

public class ClassDemo {

    // state
    String name ="Java";  //instance variable

    public void display()
    {
        System.out.println(name);
    }

    public static void main(String [] agr)
    {
        ClassDemo classDemo = new ClassDemo();  //creation of object
        ClassDemo classDemo1 = new ClassDemo();
        classDemo.name="abcd";
        classDemo.display(); // abcd
        classDemo1.display();//java
    }

}
