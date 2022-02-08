package com.company;

public class Singer extends Person{
    String bandName;

    public void singing() {
        System.out.println("singing");
    }
    public void playGuitar() {
        System.out.println("playing in classic guitar");
    }

    public Singer(String name, String designation, String nameOfBand) {
        super(name, designation);
        this.bandName = nameOfBand;
    }
    @Override
    public String toString() {
        return "Her name is " + this.name + ". She is singing " + designation + ", her band name is " + bandName;
    }
}
