package com.progresspoint.services;

import com.progresspoint.utils.InvalidArithmeticSymbol;
import com.progresspoint.utils.InvalidInputStucture;
import com.progresspoint.utils.Validator;

public class StringInputProcessor implements InputProcessor {

    private final String arithmeticSymbol;
    private final int val1;
    private final int val2;
    private final Validator validator;

    public StringInputProcessor(String inputString) throws NumberFormatException, InvalidArithmeticSymbol, InvalidInputStucture{
        this.validator = new Validator();
        final String[] arrOfValuesFromInput = processInput(inputString);
        this.arithmeticSymbol = createArithmeticSymbol(arrOfValuesFromInput[0]);
        this.val1 = Integer.parseInt(arrOfValuesFromInput[1]);
        this.val2 = Integer.parseInt(arrOfValuesFromInput[2]);
    }


    @Override
    public String[] processInput(final String inputString) throws InvalidInputStucture {
        int EXPECTED_ARRAY_LENGTH = 3;
        String[] arr = inputString.split(" ");

        if(arr.length == EXPECTED_ARRAY_LENGTH){
            return arr;
        }
        throw new InvalidInputStucture("Input string has invalid structure. Symbol and two values needed");
    }

    @Override
    public String getSymbol() {
        return this.arithmeticSymbol;
    }

    @Override
    public int getVal1() {
        return this.val1;
    }

    @Override
    public int getVal2() {
        return this.val2;
    }


    private String createArithmeticSymbol(String symbol) throws InvalidArithmeticSymbol{
        if(validator.validateSymbol(symbol)){
            return symbol;
        }
        throw new InvalidArithmeticSymbol("Invalid Arithmetic operation symbol: " + symbol + " Please use correct one");
    }


}
