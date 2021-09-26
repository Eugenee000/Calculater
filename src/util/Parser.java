package util;

public class Parser {
    public static String[] getValues(String x) {
        String[] operands = x.split("[/*+-]");
        if (operands[0].replaceAll("[0-9a-zA-Z]+", "").matches("[.,]")) {
            throw new NumberFormatException("Должны быть целые числа");
        }
        return operands;
    }

    public static String getOperator(String x) {
        return x.replaceAll("[0-9a-zA-Z]+", "").trim();
    }
}
