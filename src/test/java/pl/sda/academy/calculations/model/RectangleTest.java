package pl.sda.academy.calculations.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @ParameterizedTest
    @MethodSource("provideArguments1")
    void shouldCalculateAreaOfRectangle(Rectangle rectangle, Integer expectedArea) {
        // given

        // when
        Integer actualArea = rectangle.getArea();

        // then
        assertEquals(expectedArea, actualArea);
    }

    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(new Rectangle(), null),
                Arguments.of(new Rectangle(1, 1), 1),
                Arguments.of(new Rectangle(5, 4), 20),
                Arguments.of(new Rectangle(5, 0), 0),
                Arguments.of(new Rectangle(null, 4), null),
                Arguments.of(new Rectangle(4, null), null)
        );
    }
}
