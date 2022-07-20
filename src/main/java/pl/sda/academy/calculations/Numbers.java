package pl.sda.academy.calculations;

import java.util.OptionalInt;

public class Numbers {

    // findFirstDigit("abc12def") -> OptionalInt(1)
    // findFirstDigit("5abc12def") -> OptionalInt(5)
    // findFirstDigit("24") -> OptionalInt(2)
    // findFirstDigit("xyz") -> OptionalInt.empty
    // findFirstDigit("") -> OptionalInt.empty
    // findFirstDigit("    ") -> OptionalInt.empty
    // findFirstDigit(null) -> OptionalInt.empty
    // OptionalInt -> Optional with int
    public OptionalInt findFirstDigit(String number) {
        if (number == null || number.trim().length() == 0) {
            return OptionalInt.empty();
        }

        return number.chars() // 'a', 'b', 'c', '1', '2', 'd', 'e', 'f'
                .filter(element -> Character.isDigit(element)) // '1', '2'
                .map(element -> Character.getNumericValue(element)) // 1, 2
                .findFirst(); // 1
    }
}
