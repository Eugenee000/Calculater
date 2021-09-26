package impl;

public class ArabCalcImpl implements Calculate {
    private final String[] values;
    private final String operator;
    private String result = null;

    public ArabCalcImpl(String[] values, String operator) {
        this.operator = operator;
        this.values = values;
    }

    private String getResult() {
        if(Integer.parseInt(values[0].trim()) > 10 | Integer.parseInt(values[1].trim()) > 10){
            throw new NumberFormatException("числа не могут быть больше 10");
        }
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        return switch (operator) {
            case "+" -> result = String.valueOf(a + b);
            case "-" -> result = String.valueOf(a - b);
            case "/" -> result = String.valueOf(a / b);
            case "*" -> result = String.valueOf(a * b);
            default -> result;
        };
    }

    @Override
    public String calculate() {
        return getResult();
    }
}
