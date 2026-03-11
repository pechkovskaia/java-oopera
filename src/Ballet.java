public class Ballet extends MusicalShow {

    private String choreographer;

    public Ballet(String title, String musicAuthor, String librettoText, String choreographer) {
        super(title, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
