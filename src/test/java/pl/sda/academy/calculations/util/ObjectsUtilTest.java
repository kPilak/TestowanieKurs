package pl.sda.academy.calculations.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ObjectsUtilTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    void shouldReturnTrueForOddNumber(int number) {
        assertTrue(ObjectsUtil.isOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, 0.0, 0.00, 54, 98.76, 100, 100.})
    void shouldReturnTrueForValidPercent(double percent) {
        assertTrue(ObjectsUtil.isValidPercent(percent));
    }

    @ParameterizedTest
    @ValueSource(strings = {"raz1", "123", "0", "bank99"})
    void shouldReturnTrueForStringContainingDigits(String string) {
        assertTrue(ObjectsUtil.containsDigits(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "xx", "   ", "bcd", "one"})
    void shouldReturnFalseForStringNotContainingDigits(String string) {
        assertFalse(ObjectsUtil.containsDigits(string));
    }

    @ParameterizedTest
    @ValueSource(classes = {Integer.class, Float.class, Long.class, Double.class})
    void shouldReturnTrueForClassExtendingNumber(Class<?> clazz) {
        assertTrue(ObjectsUtil.extendsWithNumberClass(clazz));
    }
}
