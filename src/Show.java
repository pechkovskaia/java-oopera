import java.util.ArrayList;
import java.util.List;

public class Show {

    private String title;
    protected List<Actor> listOfActors;

    public Show(String title) {
        this.title = title;
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

            if (listOfActors.get(i).getLastName().equals(lastName)) {
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
}
