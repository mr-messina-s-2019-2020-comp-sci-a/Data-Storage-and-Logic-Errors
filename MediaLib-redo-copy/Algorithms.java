
/**
 * Write a description of class Algorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithms
{
   public static void main()
   {
       Song[] topTenSongs = {new Song("I love rock and roll",8),
                              new Song("One", 2),
                              new Song("Sweet Child O' Mine", 4),
                              new Song("Smoke On the Water", 7),
                              new Song("Back in Black", 2),
                              new Song("The Twist", 10),
                              new Song("Mack the Knife", 9),
                              new Song("Smells Like Teen Spirit", 5),
                              new Song("Livin On A Prayer", 2),
                              new Song("Bohemian Rhapsody", 1)
       };
       int bestSoFar = 20;
       int worstSoFar = 0;
       String tiedForSecond = " "; 
       //loop iterates through top ten songs
       for (Song s : topTenSongs)
       {
           // checks for best rating so far
           if(s.getRating() < bestSoFar)
           {
                bestSoFar = s.getRating();
                //System.out.println(s.getTitle());
                //System.out.println(bestSoFar);
           }
           //checks for worst rating so far
           if (s.getRating() > worstSoFar)
           {
               worstSoFar = s.getRating();
               //System.out.println(worstSoFar);
           }
           //checks for a tie for second
           if (s.getRating() == 2)
           {
               tiedForSecond = tiedForSecond + ", " + s.getTitle(); 
           }
       }
       System.out.println(tiedForSecond);
    }
}
