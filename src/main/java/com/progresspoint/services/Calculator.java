package com.progresspoint.services;

import com.progresspoint.model.ArithmeticOperation;
import com.progresspoint.repository.ArithmeticOperators;

public class Calculator {

    private final ArithmeticOperators operators;
    private final InputProcessor processor;

    public Calculator(final ArithmeticOperators operators, final InputProcessor processor) {
        this.operators = operators;
        this.processor = processor;
    }

    public int calculateResult(){
        ArithmeticOperation operator = (ArithmeticOperation) operators.arithmeticOperationFactory(processor.getSymbol());
        return operator.operationResult(processor.getVal1(), processor.getVal2());
    }


}
