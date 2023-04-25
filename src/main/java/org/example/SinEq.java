package org.example;

import static java.lang.StrictMath.sin;

public class SinEq implements IFuncOneVar {
    private double A, B, a, b;

    public SinEq(double A, double B, double a, double b){
        this.A = a;
        this.B = B;
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcValue(double x) {
        if (x < a || x > b) {
            throw new IllegalArgumentException("The value does not belong to the segment");
        }
        return A * sin(B*x);
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