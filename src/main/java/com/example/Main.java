package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cavallo c1 = new Cavallo;
        Cavallo c2 = new Cavallo;
        Cavallo c3 = new Cavallo;

        c1.start();
        c2.start();
        c3.start();

        c1.join();
        c2.join();
        c3.join();


    }
}