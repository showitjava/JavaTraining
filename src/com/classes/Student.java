package com.classes;

public class Student {

    int roll_no;
    String name;

     static final String college = "IIT";

     Student(int i,String n)
     {
         roll_no = i;
         name = n;
     }
     public  void display()
     {
         System.out.println("Name of student :" +name + "RollNO : "+ roll_no + "college name :" +college);
     }
   /*  static void  collegeNameChangeMethod()
     {
         college = "IET";
     }*/
}
// 1000 -> 2*1000 -> 2000
