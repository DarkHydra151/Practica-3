package com.example.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.print("Введіть перше число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введіть друге число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Виберіть операцію (+, -, *, /): ");
            String operation = scanner.next();

            double result = 0;

            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    throw new InvalidInputException("Невідома операція.");
            }

            System.out.println("Результат: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (InvalidInputException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Неправильне введення. Будь ласка, введіть числа.");
        } finally {
            System.out.println("Операція закінчена.");
        }
    }
}
