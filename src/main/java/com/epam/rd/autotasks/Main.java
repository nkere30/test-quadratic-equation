package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        String eq = quadraticEquation.solve(7,1,4);
        System.out.println(eq);
    }
}
