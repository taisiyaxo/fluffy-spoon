package org.example;

public class sumEndsMiddleOfSegment  implements IFuncionalOneVar<IFuncOneVar>{

    @Override
    public double funcional(IFuncOneVar func) {
        return func.calcValue(func.getA()) + func.calcValue(func.getB()) + func.calcValue((func.getA()+func.getB())/2.0);
    }
}
