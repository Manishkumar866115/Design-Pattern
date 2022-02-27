package com.company;

import com.company.Context.Context;

public class Main {

    public static void main(String[] args) {

        double a = 5;
        double b = 2;
        Context myCalculator = new Context('/');
        System.out.println(myCalculator.calculate(a,b));
    }
}
