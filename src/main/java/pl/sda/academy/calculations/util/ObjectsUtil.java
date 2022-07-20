package pl.sda.academy.calculations.util;

import pl.sda.academy.calculations.Numbers;

public class ObjectsUtil {

    public static boolean isOddNumber(int number) {
        return number % 2 != 0;
    }

    public static boolean isValidPercent(double percent) { // 0 <= percent <= 100
        return percent >= 0 && percent <= 100;
    }

    public static boolean containsDigits(String string) {
//        Numbers numbers = new Numbers();
//        return numbers.findFirstDigit(string).isPresent();
        return string != null && string.matches(".*\\d.*");
    }

    public static boolean extendsWithNumberClass(Class<?> clazz) {
        //
//        String liczba1 = "54";
//        Number number = liczba1;
        return clazz != null && Number.class.isAssignableFrom(clazz);
    }
}
