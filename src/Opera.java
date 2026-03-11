public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(String title, String musicAuthor, String librettoText, int choirSize) {
        super(title, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
