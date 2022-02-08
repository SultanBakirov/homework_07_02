package com.company;

public class Programmer extends Person{
    String companyName;

    public void coding() {
        System.out.println("coding");
    }
    public Programmer(String name, String designation, String nameOfCompany) {
        super(name, designation);
        this.companyName = nameOfCompany;
    }
    @Override
    public String toString() {
        return "Her name is " + this.name + ". She works at position " + designation + ", at " + companyName + " company";
    }
}
