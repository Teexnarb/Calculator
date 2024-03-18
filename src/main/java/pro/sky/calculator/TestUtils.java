package pro.sky.calculator;

public class TestUtils {
    public static String formatResult(int number1, int number2, String action, String result) {
        return String.format("%s %s %s = %s", number1, action, number2, result);
    }
}
