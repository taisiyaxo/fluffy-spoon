package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AllTeasts {
    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void expEqTest() throws IllegalArgumentException{
        ExpEq func = new ExpEq(5,5,-1,5);
        assertEquals(func.calcValue(0),10,0);
        assertEquals(func.calcValue(-2),"The value does not belong to the segment");
    }

    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void sinEqTest()throws IllegalArgumentException {
        SinEq func = new SinEq(5, 1, 1, 50);
        assertEquals(func.calcValue(0), 5, 0);
        assertEquals(func.calcValue(51), "The value does not belong to the segment");
    }
    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void fractionEqTest()throws IllegalArgumentException {
        FractionsEq func = new FractionsEq(5, 1, 1, -3, 2, 6);
        assertEquals(func.calcValue(4), 21,0);
        assertEquals(func.calcValue(51), "The value does not belong to the segment");
        assertEquals(func.calcValue(3), "Out of range");
    }
    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void lineEqTest()throws IllegalArgumentException{
        LineEq func = new LineEq(5, 7, 1, 50);
        assertEquals(func.calcValue(51), "The value does not belong to the segment");
    }
    @Test
    public void sumEndsMiddleOfSegmentTest(){
        sumEndsMiddleOfSegment sum =  new sumEndsMiddleOfSegment();
        LineEq func1 = new LineEq(5, 7, 1, 50);
        FractionsEq func2 = new FractionsEq(5, 1, 1, 0, 2, 6);
        SinEq func3 = new SinEq(5, 1, 1, 2);
        ExpEq func4 = new ExpEq(5,5,-1,5);
        assertEquals(sum.funcional(func1), 95,5);
        assertEquals(sum.funcional(func2), 15,3);
        assertEquals(sum.funcional(func3), 2,3);
        assertEquals(sum.funcional(func4), 795,3);
    }
    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void integrationTest()
    {
        SinEq func1 = new SinEq(5, 1, 0, 2);
        SinEq func2 = new SinEq(5, 1, 0.5, 2);
        Integration I = new Integration(0,2);
        assertEquals(I.funcional(func2),"The segment of the function is not contained in the segment of integration");
    }


}
