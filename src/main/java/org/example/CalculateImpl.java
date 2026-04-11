package org.example;

public class CalculateImpl implements CalculateOperator {
    @Override
    public double sum(double num1, double num2) {
        return num1 + num2 +2;
    }

    @Override
    public double minus(double num1, double num2) {
        return num1 - num2;
    }
}
