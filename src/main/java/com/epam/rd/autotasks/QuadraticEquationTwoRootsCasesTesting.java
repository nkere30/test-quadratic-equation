package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private String expected;
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, -2, -3, "-1.0 3.0"},
                {1, -5, 6, "2.0 3.0"},
                {1, -1, -56, "-7.0 8.0"},
                {1, 1, -12, "-4.0 3.0"},
                {1, 15.0/4, -1, "-4.0 0.25"},
                {1, -2, -3, "3.0 -1.0"},
                {1, -5, 6, "3.0 2.0"},
                {1, -1, -56, "8.0 -7.0"},
                {1, 1, -12, "3.0 -4.0"},
                {1, 15.0/4, -1, "0.25 -4.0"}
        });
    }

    @Test
    public void testTwoRootsCases() {
        String twoRootsResultStr = quadraticEquation.solve(a, b, c);
        String[] splitTwoRootsResultStr = twoRootsResultStr.split(" ", 2);
        String twoRootsResultReversedStr = splitTwoRootsResultStr[1] + " " + splitTwoRootsResultStr[0];
        assertTrue(Objects.equals(expected, twoRootsResultStr) || Objects.equals(expected, twoRootsResultReversedStr));
    }
}
