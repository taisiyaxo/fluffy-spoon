package org.example;

public class Integration implements IFuncionalOneVar<IFuncOneVar>{
    private double a;
    private double b;

    public Integration(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double funcional(IFuncOneVar func) {

        if(a < func.getA() || b > func.getB()){
            throw new IllegalArgumentException("The segment of the function is not contained in the segment of integration");
        }

        int n = 10;
        double x;
        double h = (b-a)/10;
        double sum = 0.0;
        for(int i = 0; i < n; i++){
            x = a + i*h;
            sum += func.calcValue(x);
        }
        return sum*h;
    }
}
