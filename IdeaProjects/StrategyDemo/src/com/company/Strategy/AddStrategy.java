package com.company.Strategy;

public class AddStrategy implements CalculatorStrategy{
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
