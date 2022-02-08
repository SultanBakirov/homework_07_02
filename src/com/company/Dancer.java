package com.company;

public class Dancer extends Person{
    String groupName;

    public void dancing() {
        System.out.println("dancing");
    }
    public Dancer(String name, String designation, String nameOfGroup) {
        super(name, designation);
        this.groupName = nameOfGroup;
    }
    @Override
    public String toString() {
        return "Her name is " + this.name + ". She is dancing only " + designation + ", group name is " + groupName;
    }
}
