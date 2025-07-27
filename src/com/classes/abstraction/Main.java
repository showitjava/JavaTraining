package com.classes.abstraction;

public class Main implements InterfaceDemo{

    static  int a =10;

    public  static  void main(String args[])
    {
       /* Shape s = new Shape();

        double ar =s.area(2,3);
*/
        //System.out.println(ar);
        int a=-1;
        System.out.println(Main.a);

        Main m  = new Main();
        m.display();
    }

    @Override
    public void display() {
        System.out.println("Implementing the Interface methods!! IN main class");
    }

    @Override
    public int sumOfNumbers(int a, int b) {
        return 0;
    }

    @Override
    public void javaShow() {
        System.out.println("Implementing the Interface01 methods!! IN main class");

    }
}

// //variable static
//  static int a;

//XYZ  a
