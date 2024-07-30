package com.corejavaproject.calculator;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Calculator {
    public int addition(int input1, int input2) {
        int response = input1 + input2;
        return response;
    }

    public int subtraction(int input1, int input2) {
        int responseSub = input1 - input2;
        return responseSub;
    }

    public int ModuloDivision(int input1, int input2) {
        int moduloDivision = input1 % input2;
        return moduloDivision;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addition = calculator.addition(10, 20);
        int subtraction = calculator.subtraction(100, 20);
        int moduloDivision = calculator.ModuloDivision(100, 50);
        log.info("Addition:{}", addition);
        log.info("Subtraction:{}", subtraction);
        log.info("ModuloDivision:{}", moduloDivision);
    }
}
