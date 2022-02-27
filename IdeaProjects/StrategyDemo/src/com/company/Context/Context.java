package com.company.Context;

import com.company.Strategy.*;

public class Context {
    private CalculatorStrategy calc;

    public Context(char ch) {
        switch (ch) {
            case '+':
                calc = new AddStrategy();
                break;
            case '-':
                calc = new SubtractStrategy();
                break;
            case '*':
                calc = new MultiplyStrategy();
                break;
            case '/':
                calc = new DivisionStrategy();
                break;
        }
    }

    public double calculate(double a, double b){
        return calc.calculate(a,b);
    }


}
