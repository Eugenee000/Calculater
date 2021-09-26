package impl;

import util.ArabicToRoman;
import util.RomanToArabic;

public class RomanCalcImpl implements Calculate {
    private final String[] values;
    private final String operator;
    private String result = null;

    public RomanCalcImpl(String[] values, String operator) {
        this.operator = operator;
        this.values = values;
    }

    private String getResult() {
        if (RomanToArabic.romanToArabic(values[0].trim()) > 10 | RomanToArabic.romanToArabic(values[1].trim()) > 10) {
            throw new NumberFormatException("числа не могут быть больше X");
        }
        int a = RomanToArabic.romanToArabic(values[0].trim());
        int b = RomanToArabic.romanToArabic(values[1].trim());
        return switch (operator) {
            case "+" -> result = ArabicToRoman.arabicToRoman(a + b);
            case "-" -> result = ArabicToRoman.arabicToRoman(a - b);
            case "/" -> result = ArabicToRoman.arabicToRoman(a / b);
            case "*" -> result = ArabicToRoman.arabicToRoman(a * b);
            default -> result;
        };
    }

    @Override
    public String calculate() {
        return getResult();
    }
}
