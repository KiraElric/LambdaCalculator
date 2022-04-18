package com.nisum.java.calculator;

@FunctionalInterface
public interface MathOperation {
    int operate(int firstNumber, int secondNumber);
}
