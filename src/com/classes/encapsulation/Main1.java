package com.classes.encapsulation;

public class Main1 {

    public static void main(String ars[])
    {
        Student s = new Student();

        s.setName("Kishan");
        s.setRoll_no(102);
        //s.roll_no;
      //  s.setCollege_name();

        System.out.println(s.getCollege_name());

        s.display();

    }
}
