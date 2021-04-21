package org.example;

public class main {
    public static void main(String[] args) {
        System.out.println(intParser("258") + 1);
        System.out.println(doubleParser2("258.86") + 0.14);
    }


    private static int intParser(String input) {
        int result = 0;
        for (char character : input.toCharArray()) {
            result = result * 10 + toInt(character);
        }
        return result;
    }

    private static int toInt(char character) {
        return character - '0';
    }

    private static double doubleParser(String input) {
        double result1 = 0;
        int key = 0;
        char[] x = input.toCharArray();
        for (int i = 0; i < x.length; i++) {
            if (x[i] == '.') {
                key = i + 1;
                break;
            }
            result1 = result1 * 10 + toDouble(x[i]);
        }
        int a = 1;
        for (int i = key; i < input.length(); i++) {
            result1 = result1 + toDouble(x[i]) / (Math.pow(10, a));
            a = a + 1;
        }
        return result1;
    }

    private static double doubleParser2(String input) {
        double result = 0;
        boolean foundDot = false;
        int a = 10;
        for (char character : input.toCharArray()) {
            if ('.' == character) {
                foundDot = true;
                continue;
            }
            if (foundDot) {
                result = result + toDouble(character) / a;
                a*=10;
            } else {
                result = result * 10 + toDouble(character);
            }

        }
        return result;
    }

    private static double toDouble(char character) {
        return character - '0';
    }
}
