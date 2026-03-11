public class MusicalShow extends Show {

   private String musicAuthor;
   private String librettoText;

   public MusicalShow(String title, String musicAuthor, String librettoText) {
       super(title);
       this.musicAuthor = musicAuthor;
       this.librettoText = librettoText;
   }

   public void printLibretto() {
       System.out.println("librettoText");
   }
}
