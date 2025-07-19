package com.classes;

public class Empolyee {
    int id;
    String name ;
    int salary;

    Empolyee(int id, String name)
    {
        id = id;
        this.name =name;
    }

    //method........

}
class Programmer extends  Empolyee{

    int extra_salary =100;

    Programmer(int id, String name,int extra_salary) {
        super(id, name);// super.id super()
    }
}

class NewDev extends  Programmer{

    NewDev(int id, String name, int extra_salary) {
        super(id, name, extra_salary);
    }
}

class Main1{
    public static  void main(String anything[])
    {
        Programmer p = new Programmer(100,"A",100) ;
        Programmer p1 = new Programmer(101,"B",1001) ;
        /*p.id =1001;
        p.name= "Feny";
        p.salary  = 1;*/
        p.salary =10000;

        System.out.println(p.id +" "+ p.name+" " +(p.salary+p.extra_salary));
        //
    }
}