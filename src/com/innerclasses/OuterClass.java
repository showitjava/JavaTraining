package com.innerclasses;

interface  Greet{
    void sayHello();
}

public class OuterClass  {

    String name = "Java";
    class  Inner{
        String value;
        void display()
        {
            System.out.println("we are in inner class!!");
        }
    }

    static class Inner2{
        void display()
        {
            System.out.println("we are in static inner class!!");
        }
    }

    public void outerMethod()
    {
        class Inner3{

            void display()
            {
                System.out.println("we are in method inner class!!");
            }
        }
        Inner3 inner3 = new Inner3();
        inner3.display();

    }

    // 4 Anonymous class
    Greet g = new Greet() {
        @Override
        public void sayHello() {
            System.out.println("Hello Java!!");
        }
    };




}


