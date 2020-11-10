package com.progresspoint.model;

public class Addition implements ArithmeticOperation {

    @Override
    public int operationResult(final int val1, final int val2) {
        return Math.addExact(val1, val2);
    }
}
