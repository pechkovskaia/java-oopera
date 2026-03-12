import java.util.Objects;

public class Director extends Person {

    protected int numberOfShows;

    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShows);
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfShows=" + numberOfShows;
    }
}
