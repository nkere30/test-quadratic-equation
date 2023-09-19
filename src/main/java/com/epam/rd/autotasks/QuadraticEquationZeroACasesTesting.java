package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1, 1},
                {0, 2, 4},
                {0, 2, 16},
                {0, 5, 20},
                {0, 5, 25}
        });
    }

    @Test(expected =  IllegalArgumentException.class)
    public void testZeroACase() {
        String zeroValueOfA = "0";
        assertEquals(zeroValueOfA, quadraticEquation.solve(a, b, c).substring(0, 1));
    }
}
