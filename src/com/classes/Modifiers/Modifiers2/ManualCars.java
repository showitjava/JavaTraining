package com.classes.Modifiers.Modifiers2;


import com.classes.Modifiers.*;

public class ManualCars extends Car {

    public ManualCars(String car_name, String car_colour, String logo, int age) {
        super(car_name, car_colour, logo, age);
    }

    public  void manualCarRun()
    {
        ManualCars c = new ManualCars("BMW","White","BMW",2);


        c.logo="logo";
        c.display2();

        System.out.println("Using manual Car!!");
    }

}
