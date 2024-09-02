import java.util.Scanner;  

public class GettingInputs {  
    public static void main(String[] args) {  
        Scanner inputScanner = new Scanner(System.in);  

        System.out.print("Enter the year: ");  
        String year = inputScanner.nextLine();  

        System.out.print("Enter the genre: ");  
        String genre = inputScanner.nextLine();  

        System.out.print("Enter the album: ");  
        String album = inputScanner.nextLine();  

        System.out.print("Enter the song title: ");  
        String title = inputScanner.nextLine();  

        System.out.print("Enter the artist: ");  
        String artist = inputScanner.nextLine();  

        System.out.println("-------------------------");
        
        System.out.println("SONG DETAILS");
        
        System.out.println("-------------------------");
        
        System.out.println("Year Released: " + year);  
        System.out.println("Genre: " + genre);  
        System.out.println("Album: " + album);  
        System.out.println("Title: \"" + title + "\"");  
        System.out.println("Artist: " + artist);  

        inputScanner.close();
    }
}
