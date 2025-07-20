package com.classes.encapsulation;


public class Student {

    private String name ;
    private int roll_no;
    private String college_name ="IIT";

    public String getCollege_name() {
        return college_name;
    }

    public void display()
    {
        System.out.println(name +" "+ roll_no);
    }

    public void setName(String name)
    {
        this.name =name;
    }
    public  String getName()
    {
        return name;
    }
    /*public int getRoll_no() {
        return roll_no;
    }*/

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

}// java bean class


