package com.classes;


public class InheritanceDemo {

    public static  void main(String ars[])
    {
        Animal d = new Dog();
        d.eat();
      //  d.bark();
        d.eat();
        NewDogs newDogs = new NewDogs();
        newDogs.name ="Golld";

        newDogs.crawl();
        System.out.println("Name of newDog :" + newDogs.name);
    }

}
 class Animal{
    String name;

    void eat()
    {
        System.out.println("Animal is eating!!");
    }
}

class Dog extends Animal {
    void bark()
    {
        System.out.println("Barking!!");
    }
}

class Cat extends Animal{
    void meow()
    {

        System.out.println("Meowing!!");
    }
}

class NewDogs extends  Dog
{
    void crawl()
    {
        System.out.println("Crawling!!1");
    }
}

