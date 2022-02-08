package com.company;

public class Person {
    String name;
    String designation;


    void learn() {
        System.out.println("learning");
    }
    void walk() {
        System.out.println("walking");
    }
    void eat() {
        System.out.println("eating");
    }
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
}
