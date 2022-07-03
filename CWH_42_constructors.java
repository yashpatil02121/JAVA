package com.company;

class MyMainEmployee{
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee()
    {
        id = 45;
        name = "Your-Name-Here";
        salary = 10000;
    }

    public MyMainEmployee(String myName,int ID)
    {
        id = ID;
        name = "Your-Name-Here";
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name= n;
    }
    public void setId(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }
    public void setSalary(int sal){salary=sal;}
    public int getSalary(){return salary; }
}

public class CWH_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        harry.setName("CodeWithHarry");
        harry.setId(34);
        harry.setSalary(1000);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
        System.out.println(harry.getSalary());

    }
}
