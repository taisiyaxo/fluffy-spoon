package org.example;

import static java.lang.Math.exp;

public class ExpEq implements IFuncOneVar {
    private double A, B, a, b;

    public ExpEq(double A, double B, double a, double b){
        this.A = A;
        this.B = B;
        this.a = a;
        this.b = b;
    }
    @Override
    public double calcValue(double x) {
        if (x < a || x > b) {
            throw new IllegalArgumentException("The value does not belong to the segment");
        }
        return A * exp(x) + B;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public double getB() {
        return b;
    }
}
