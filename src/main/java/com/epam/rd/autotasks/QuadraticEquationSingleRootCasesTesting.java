package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.Double.parseDouble;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private double expected;
    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        expected = parseDouble(quadraticEquation.solve(a, b, c));
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 6, 9, -3},
                {1, -6, 9, 3},
                {1, 14, 49, 7},
                {1, 5, 6.25, 2.5},
                {-4, 12, -9, -3.0/2}
        });
    }
    @Test
    public void testSingleRootCase() {
        assertEquals(Double.toString(expected), quadraticEquation.solve(a, b, c));
    }
}