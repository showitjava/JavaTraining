package com.classes.Modifiers;

public class Car {

    // private //protected //public //
    // Access modifiers // non access modifires //type // variable_name

    String car_name;  // by default -> they are of default type access modifiers // with a same package
    private String car_colour;// access allowed only in same class
    protected String logo;
    public int age;

    public  void running(){
        System.out.println("Running!!");
    }

    public Car(String car_name, String car_colour, String logo, int age) {
        this.car_name = car_name;
        this.car_colour = car_colour;
        this.logo = logo;
        this.age = age;
    }


    private void display()
    {
        System.out.println(car_name);
        System.out.println(car_colour);
        System.out.println(logo);
        System.out.println(age);
    }
    protected void display2()
    {
        display();
    }
}
