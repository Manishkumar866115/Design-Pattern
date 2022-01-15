package com.company;

public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if( singleton1 == singleton2)
            System.out.println("Singleton class successfully created");
        else
            System.out.println("Not a Singleton class");
    }
}
