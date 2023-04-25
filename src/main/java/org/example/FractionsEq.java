package org.example;

public class FractionsEq implements IFuncOneVar {

    private double A, B, C, D, a, b;

    public FractionsEq(double a, double b, double c, double d, double a1, double b1) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.a = a1;
        this.b = b1;
    }

    @Override
    public double calcValue(double x) {
        if (x < a || x > b) {
            throw new IllegalArgumentException("The value does not belong to the segment");
        }
        double subRes = C*x + D;
        if (subRes == 0){
            throw new IllegalArgumentException("Out of range");
        }

        return (A*x+B)/subRes;
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
