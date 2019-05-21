package com.javaproject.firstproject.oop;

public class Human {

    String firstName;
    String lastName;
    int age;

    public Human() {
    }

    public Human(String firstName) {
        this.firstName = firstName;
    }

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void doSomething(){
        System.out.println("I do something");
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
