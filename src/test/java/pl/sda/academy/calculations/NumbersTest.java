package pl.sda.academy.calculations;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

class NumbersTest {

    private Numbers numbers;

    @BeforeEach
    void init() {
        numbers = new Numbers();
    }

    @Test
    void shouldFirstDigitInString() {
        // given
        String value = "abc12def";

        // when
        OptionalInt firstDigit = numbers.findFirstDigit(value);

        // then
        Assertions.assertThat(firstDigit)
                .isNotNull()
                .isPresent()
                .hasValue(1);
    }

    @Test
    void shouldFindAnyDigitWhenThereAreNone() {
        // given
        String value = "xyz";

        // when
        OptionalInt firstDigit = numbers.findFirstDigit(value);

        // then
        Assertions.assertThat(firstDigit)
                .isNotNull()
                .isEmpty();
    }
}