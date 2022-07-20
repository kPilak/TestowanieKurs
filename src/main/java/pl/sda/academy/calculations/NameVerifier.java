package pl.sda.academy.calculations;

public class NameVerifier {

    public boolean isNameValid(String name) {
        // "  ab c " -> "ab c"
        // "   " -> ""
        // "JaN" != "JAN"
        return name != null
                && name.trim().length() > 0
                && !name.toUpperCase().equals(name)
                && !name.toLowerCase().equals(name);
    }
}
