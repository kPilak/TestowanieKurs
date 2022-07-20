package pl.sda.academy.calculations;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameVerifierTest {

    private NameVerifier nameVerifier;

    @BeforeEach
    void beforeEach() {
        nameVerifier = new NameVerifier();
        System.out.println("In before each...");
    }

    @AfterEach
    void afterEach() {
        System.out.println("In after each...");
    }

    @Test
    void shouldValidateName() {
        // given
        String name = "Kazimierz";
//        NameVerifier nameVerifier = new NameVerifier();

        // when
        boolean nameValid = nameVerifier.isNameValid(name);

        // then
        assertTrue(nameValid);
    }

    @Test
    void shouldNotValidateNameWhenAllLettersAreLowerCase() {
        // given
        String name = "andrzej";
//        NameVerifier nameVerifier = new NameVerifier();

        // when
        boolean nameValid = nameVerifier.isNameValid(name);

        // then
        assertFalse(nameValid);
    }
}