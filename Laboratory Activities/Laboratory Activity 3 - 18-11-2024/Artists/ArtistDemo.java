public class ArtistDemo {
    public static void main(String[] args) {
        // Instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        // Instance of Singer
        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        // Instance of Painter
        Painter painter = new Painter("Pablo Picasso", "Spanish", 91, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        // Instance of Dancer
        Dancer dancer = new Dancer("Michael Jackson", "American", 50, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        // Instance of Writer
        Writer writer = new Writer("J.K. Rowling", "British", 58, "Writing", WritingStyle.FICTION);
        writer.displayInfo();
    }
}
