package com.classes.poly;

class Animal {
    String name;
    void makingSound()
    {
        System.out.println("Making noise!!");
    }
}

class Dog extends Animal
{
    void eating()
    {
        System.out.println("Dog is eating!!");
    }
    @Override
    void makingSound()
    {
        System.out.println("Barking!!");
    }

}

public class Main{

    public static void main(String args[])
    {
        Animal a = new Animal();
        Animal an = new Dog();
        Dog ddd = (Dog)new Animal();
        // method overriding..
        Dog d = new Dog();

        a.makingSound(); //m s
        an.makingSound(); // barking
        d.makingSound();//m s // barking
    }
}

