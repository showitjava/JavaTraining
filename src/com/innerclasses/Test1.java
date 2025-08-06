package com.innerclasses;

public class Test1 {

    public static  void main(String args[])
    {
        OuterClass outerClass = new OuterClass();
        OuterClass.Inner inner = outerClass.new Inner();

        OuterClass.Inner2 inner2 = new OuterClass.Inner2();

       System.out.println( outerClass.name);

       inner.display();
       inner2.display();
        outerClass.outerMethod();

        outerClass.g.sayHello();

    }
}
