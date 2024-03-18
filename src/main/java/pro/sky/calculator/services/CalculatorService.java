package pro.sky.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService  {
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
    public String plus(int number1, int number2) {
        return formatResult(number1, number2, "+", String.valueOf(number1 + number2));
    }

    public String minus(int number1, int number2) {
        return formatResult(number1, number2, "-", String.valueOf(number1 - number2));
    }
    public String multiply(int number1, int number2) {
        return formatResult(number1, number2, "*", String.valueOf(number1 * number2));
    }

    public String divide(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("На 0 делить незльзя");
        }
        return formatResult(number1, number2, "/", String.valueOf((double) number1 / (double) number2));
    }
    private String formatResult(int number1, int number2, String action, String result) {
        return String.format("%s %s %s = %s", number1, action, number2, result);
    }
}
