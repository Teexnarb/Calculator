package pro.sky.calculator.services;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.TestUtils;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    void calculator_success() {
        String expectResult = "Добро пожаловать в калькулятор";
        String actualResult = calculatorService.calculator();
        assertEquals(expectResult,actualResult);
    }

    @Test
    void plus_success() {
        //Подготовка входных данных
        int number1 = 4;
        int number2 = 6;
        //Подготовка ожидаемых данных
        String expectResult = TestUtils.formatResult(number1, number2, "+", String.valueOf(number1 + number2));
        //Начало теста
        String actualResult = calculatorService.plus(number1, number2);
        assertEquals(expectResult,actualResult);
    }

    @Test
    void minus_success() {
        //Подготовка входных данных
        int number1 = 40;
        int number2 = 6;
        //Подготовка ожидаемых данных
        String expectResult = TestUtils.formatResult(number1, number2, "-", String.valueOf(number1 - number2));
        //Начало теста
        String actualResult = calculatorService.minus(number1, number2);
        assertEquals(expectResult,actualResult);
    }

    @Test
    void multiply_success() {
        //Подготовка входных данных
        int number1 = 4;
        int number2 = 6;
        //Подготовка ожидаемых данных
        String expectResult = TestUtils.formatResult(number1, number2, "*", String.valueOf(number1 * number2));
        //Начало теста
        String actualResult = calculatorService.multiply(number1, number2);
        assertEquals(expectResult,actualResult);
    }

    @Test
    void divide_success() {
        //Подготовка входных данных
        int number1 = 4;
        int number2 = 6;
        //Подготовка ожидаемых данных
        String expectResult = TestUtils.formatResult(number1, number2, "/", String.valueOf((double) number1 / (double) number2));
        //Начало теста
        String actualResult = calculatorService.divide(number1, number2);
        assertEquals(expectResult,actualResult);
    }
    @Test
    void divide_withIllegalArgumentException() {
        //Подготовка входных данных
        int number1 = 5;
        int number2 = 0;
        //Подготовка ожидаемых данных
        String exepctedMassege = "На 0 делить нельзя!";
        //Начало теста
        Exception exception=assertThrows(IllegalAccessException.class, () -> calculatorService.divide(number1, number2));
        assertEquals(exepctedMassege, exception.getMessage());
    }
}