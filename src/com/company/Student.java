package com.company;

public class Student {
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return rollno +
                ", name= " + name +
                ", age= " + age;
    }
}
