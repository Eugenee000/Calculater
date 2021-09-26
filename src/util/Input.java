package util;

import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static String input() throws IOException {
        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine().replaceAll(" ", "");
        String[] operands = Parser.getValues(result);
        if (operands.length > 2) {
            throw new IOException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (operands.length <= 1) {
            throw new IOException("строка не является математической операцией");
        }
        String string = result.replaceAll("[/* ,.+-]+","");
        if(!(string.matches("[0-9]+") | string.matches("[a-zA-Z]+"))){
            throw new NumberFormatException("разные системы счесления");
        }
        return result;
    }
}
