package com.progresspoint.services;

import com.progresspoint.utils.InvalidInputStucture;

interface InputProcessor {

    String[] processInput(String inputString) throws InvalidInputStucture;
    String getSymbol();
    int getVal1();
    int getVal2();
}
