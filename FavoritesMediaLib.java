
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
   public static void main()
   {    String songInfo = MediaFile.readString();
       int start = 0;
       int finish = songInfo.indexOf("|");
       int ratingStart = finish - 2;
       while(songInfo != null){
          
          System.out.println("Title: " + songInfo.substring(start, ratingStart));
          System.out.println("Rating: " + songInfo.substring(ratingStart, finish));
          System.out.println(" ");
          start = finish + 1;
          finish = songInfo.indexOf("|", start);
          ratingStart = finish - 2;
          if(finish < 0){
          break;}
    }
        
       
   }
}
