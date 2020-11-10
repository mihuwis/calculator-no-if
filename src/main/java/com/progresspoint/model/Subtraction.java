package com.progresspoint.model;

public class Subtraction implements ArithmeticOperation {

    @Override
    public int operationResult(final int val1, final int val2) {
        return Math.subtractExact(val1, val2);
    }
}
