package pl.sda.academy.calculations;

public class PersonFactory {

    public Person createPerson(String firstName, String lastName) {
        String prefix = firstName.endsWith("a") ? "Mr" : "Ms";
        return new Person(prefix, firstName.toLowerCase(), lastName);
    }
}
