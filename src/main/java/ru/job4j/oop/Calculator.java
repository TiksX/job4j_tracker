package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + minus(d) + multiply(d) + divide(d);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        System.out.println(resultSum);

        Calculator calculator = new Calculator();
        int resultMulty = calculator.multiply(5);
        System.out.println(resultMulty);

        int resultMinus = Calculator.minus(10);
        System.out.println(resultMinus);

        Calculator calculatorDivide = new Calculator();
        int resultDivide = calculator.divide(15);
        System.out.println(resultDivide);

        Calculator calculatorSumAll = new Calculator();
        int resultSumAll = calculator.sumAllOperation(50);
        System.out.println(resultSumAll);
    }
}

