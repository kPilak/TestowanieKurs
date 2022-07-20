package pl.sda.academy.calculations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonFactoryTest {

    @Test
    void shouldCreateMalePerson() {
        // given
        PersonFactory personFactory = new PersonFactory();
        String firstName = "Andrzej";
        String lastName = "Nowak";

        // when
        Person person = personFactory.createPerson(firstName, lastName);

        // then
        assertNotNull(person);
//        assertEquals("Mr", person.getPrefix());
//        assertEquals(firstName, person.getFirstName());
//        assertEquals(lastName, person.getLastName());

        assertAll(
                () -> assertEquals("Mr", person.getPrefix()),
                () -> assertEquals(firstName, person.getFirstName()),
                () -> assertEquals(lastName, person.getLastName())
        );
    }
}