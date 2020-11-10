package com.progresspoint.services;

import com.progresspoint.repository.ArithmeticOperators;
import com.progresspoint.repository.ArithmeticOperatorsMap;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final ArithmeticOperators operators= new ArithmeticOperatorsMap();

    @Test
    public void calculateResult_whenAdditionOfValidValues_returnCorrectValue() throws Exception{
        String input = "+ 2 3";
        final Calculator calculator = new Calculator(operators, new StringInputProcessor(input) );

        int expectedReturn = 5;
        assertEquals(expectedReturn, calculator.calculateResult() );
    }

    @Test
    public void calculateResult_whenSubtractionOfValidValues_returnCorrectValue() throws Exception{
        String input = "- 2 3";
        final Calculator calculator = new Calculator(operators, new StringInputProcessor(input) );

        int expectedReturn = -1;
        assertEquals(expectedReturn, calculator.calculateResult() );
    }

    @Test
    public void calculateResult_whenMultiplicationOfValidValues_returnCorrectValue() throws Exception{
        String input = "* 2 3";
        final Calculator calculator = new Calculator(operators, new StringInputProcessor(input) );

        int expectedReturn = 6;
        assertEquals(expectedReturn, calculator.calculateResult() );
    }

    @Test
    public void calculateResult_whenDivisionOfValidValues_returnCorrectValue() throws Exception{
        String input = "/ 2 3";
        final Calculator calculator = new Calculator(operators, new StringInputProcessor(input) );

        int expectedReturn = 0;
        assertEquals(expectedReturn, calculator.calculateResult() );
    }

    @Test
    public void calculateResult_whenDivisionByZero_throwsArithmeticExc() throws Exception{
        String input = "/ 2 0";
        final Calculator calculator = new Calculator(operators, new StringInputProcessor(input) );

        assertThrows(ArithmeticException.class, calculator::calculateResult);
    }

    @Test
    public void calculateResult_whenModuloOfValidValues_returnCorrectValue() throws Exception{
        String input = "% 2 3";
        final Calculator calculator = new Calculator(operators, new StringInputProcessor(input) );

        int expectedReturn = 2;
        assertEquals(expectedReturn, calculator.calculateResult() );
    }

    @Test
    public void calculateResult_whenOutputValuesExcisingIntegerValues_throwsArithmeticExc() throws Exception{
        String input = "* 2000000 3000000";
        final Calculator calculator = new Calculator(operators, new StringInputProcessor(input) );

        assertThrows(ArithmeticException.class, calculator::calculateResult);
    }

}