package com.progresspoint.utils;

import java.util.Arrays;

public class Validator {

    public boolean validateSymbol(String symbol){
        String[] validSymbols = {"+", "-", "/", "*", "%"};
        return Arrays.asList(validSymbols).contains(symbol);
    }

}
