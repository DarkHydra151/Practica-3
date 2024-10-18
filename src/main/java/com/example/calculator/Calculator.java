package com.example.calculator;

public class Calculator {

    // Метод додавання
    public double add(double a, double b) {
        return a + b;
    }

    // Метод віднімання
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод множення
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод ділення з обробкою винятку
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе.");
        }
        return a / b;
    }
}
