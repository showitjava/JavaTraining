package com.collection.list.ArrayList;

import java.util.ArrayList;

public class Test1 {

    public static  void main(String args[])
    {

        ArrayList<Student> studentsOfClass12 = new ArrayList<>();

        studentsOfClass12.add(new Student("Bhuvnesh",25, 101));
        studentsOfClass12.add(new Student("Yatri",24, 102));
        studentsOfClass12.add(new Student("kishan",26, 103));


        for(Student s :studentsOfClass12)
        {
            System.out.println("Student rollno " +s.roll_no + " Name: "+s.name
            + " Age: "+ s.age);
        }

    }
}
