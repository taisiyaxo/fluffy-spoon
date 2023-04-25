package org.example;

public class LineEq implements IFuncOneVar {
    private double A, B, a, b;
    public LineEq(double A, double B, double a, double b) {
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
        return A * x + B;
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
