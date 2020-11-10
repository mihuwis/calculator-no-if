package com.progresspoint.model;

public class Modulo implements ArithmeticOperation {

    @Override
    public int operationResult(final int val1, final int val2) {
        return Math.floorMod(val1, val2);
    }
}
