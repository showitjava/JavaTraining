package com.classes.Modifiers3;

import com.classes.Modifiers.Car;

public class AutomaticCars extends Car {
    public AutomaticCars(String car_name, String car_colour, String logo, int age) {
        super(car_name, car_colour, logo, age);
    }

    public void displayAutomatic() {
        AutomaticCars c = new AutomaticCars("BMW", "White", "BMW", 2);

        c.logo = "logo";
        c.age = 10;
    }
}
