package com.progresspoint.repository;

import com.progresspoint.model.*;

import java.util.Map;

public class ArithmeticOperatorsMap implements ArithmeticOperators{

    private final Map<String, Object> operatorsMap = Map.of(
            "+", new Addition(),
            "-", new Subtraction(),
            "*", new Multiplication(),
            "/", new Division(),
            "%", new Modulo());

    @Override
    public Object arithmeticOperationFactory(final String symbol) {
        return operatorsMap.get(symbol);
    }
}
