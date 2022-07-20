package pl.sda.academy.calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LinesTest {

    @Test
    void shouldValidateLines() {
        // given
        String value1 = "r.*"; // raz, ra, rxxxxxxxxxxxxx, r
        String value2 = "raz";

        // when

        // then
        Assertions.assertEquals(Arrays.asList(value1), Arrays.asList(value2));
//        Assertions.assertLinesMatch(Arrays.asList(value2), Arrays.asList(value1));
    }
}
