public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(String title, int duration, Person director,
                 String musicAuthor, String librettoText, int choirSize) {

        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
