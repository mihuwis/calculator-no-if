package com.progresspoint.model;

public class Multiplication implements ArithmeticOperation {

    @Override
    public int operationResult(final int val1, final int val2) {
        return Math.multiplyExact(val1, val2);
    }
}
