import java.util.Objects;

public class Actor extends Person {

    protected int height;

    public Actor(String firstName, String lastName, Gender gender, int height) {
        super(firstName, lastName, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return super.toString() + ", height=" + height;
    }
}