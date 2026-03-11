public class Director extends Person {

    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender, 0);
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}
