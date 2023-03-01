package com.kodilla.testing;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);
        if (result == 15){
            System.out.println("result is okay");
        } else {
            System.out.println("ERROR!");
        }

    }
}