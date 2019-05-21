package com.javaproject.firstproject.oop;

public class Teacher extends Human{
    String subject;

    public Teacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age);
        this.subject = subject;
    }

    @Override
    public void doSomething(){
        System.out.println("I teach!");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }
}
