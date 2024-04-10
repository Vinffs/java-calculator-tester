package org.learning.calculator;

public class Calculator {

    // addition between two floats
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    // subtraction between two floats

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    // division between two floats
    public float divide(float num1, float num2) throws IllegalArgumentException{
        if(num2 == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }
        return num1 / num2;
    }

    // multiplication between two floats
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }


}
