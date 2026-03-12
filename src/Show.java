import java.util.ArrayList;
import java.util.List;

public class Show {

    protected String title;
    protected int duration;
    protected Person director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Person director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже добавлен!");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String lastName) {

        for (int i = 0; i < listOfActors.size(); i++) {

            if (listOfActors.get(i).lastName.equals(lastName)) {
                listOfActors.set(i, newActor);
                System.out.println("Замена актера произведена.");
                return;
            }
        }

        System.out.println("Актёра с такой фамилией нет в списке.");
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void printDirector() {
        System.out.println("Режиссёр: " + director);
    }
}
