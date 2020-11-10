package com.progresspoint.model;

public class Division implements ArithmeticOperation {

    @Override
    public int operationResult(final int val1, final int val2) {
        return Math.floorDiv(val1, val2);
    }
}
