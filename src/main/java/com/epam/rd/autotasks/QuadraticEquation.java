package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if(a == 0) throw new IllegalArgumentException();
        String solvedMessage = "";
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x1, x2;
        if(discriminant < 0) {
            solvedMessage+="no roots";
        } else {
            x1 = (-b - Math.sqrt(discriminant))/(2 * a);
            solvedMessage += Double.toString(x1);
            if(discriminant > 0) {
                x2 = (-b + Math.sqrt(discriminant))/(2 * a);
                solvedMessage += " " + Double.toString(x2);
            }
        }
        return solvedMessage;
    }
}