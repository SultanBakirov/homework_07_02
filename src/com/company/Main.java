package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer it = new Programmer("Nurai", "software engineer", "Google");
        Dancer dance = new Dancer("Irina Kairatovna", "Eastern dance", "Jyldyz");
        Singer sing = new Singer("Svetlana Nazarenko", "classic music", "Gorod 312");
        System.out.println(it + ".\n" + dance + ".\n" + sing);
    }
}
