package com.javaproject.firstproject.oop;

public class Student extends Human{

    String faculty;
    int course;

    public Student(String firstName, String lastName, int age, String faculty, int course) {
        super(firstName, lastName, age);
        this.faculty = faculty;
        this.course = course;
    }

    @Override
    public void doSomething(){
        System.out.println("I study!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                '}';
    }
}
