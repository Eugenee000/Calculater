import impl.ArabCalcImpl;
import impl.RomanCalcImpl;
import util.Input;
import util.Parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String result = Input.input();
        String[] values = Parser.getValues(result);
        String operator = Parser.getOperator(result);

        if (values[0].replaceAll(" ", "").matches("[0-9]+") | values[1].replaceAll(" ","").matches("[0-9]+")) {
            ArabCalcImpl arab = new ArabCalcImpl(values, operator);
            System.out.println(arab.calculate());
        } else {
            RomanCalcImpl roman = new RomanCalcImpl(values, operator);
            System.out.println(roman.calculate());
        }
    }
}
