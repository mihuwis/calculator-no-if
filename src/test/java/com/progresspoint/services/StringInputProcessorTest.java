package com.progresspoint.services;

import com.progresspoint.utils.InvalidArithmeticSymbol;
import com.progresspoint.utils.InvalidInputStucture;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringInputProcessorTest {

    private InputProcessor processor;

    @Test
    public void callConstructor_withInvalidArithmeticSymbol_getInvalidArithmeticSymbolException(){
        String dodgyString = "s 1 2";
        assertThrows(InvalidArithmeticSymbol.class, ()->processor = new StringInputProcessor(dodgyString));
    }

    @Test
    public void callConstructor_withInvalidStringStructure_getInvalidInputStuctureException(){
        String dodgyString = "srr12";
        assertThrows(InvalidInputStucture.class, ()->processor = new StringInputProcessor(dodgyString));
    }

    @Test
    public void callConstructor_withInputValueExceedingIntRange_getInvalidInputStructureException(){
        String dodgyString = "* 10000000000000000000000000000 8";
        assertThrows(NumberFormatException.class, ()->processor = new StringInputProcessor(dodgyString));
    }


}