 


/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib{
  
     public static void main(){
     //creates instances of the song class
     Song song1 = new Song("Johnny B. Goode", 4.00, 7 );
     Song song2 = new Song("Sweet Child O' Mine", 2.00, 8);
     Song song3 = new Song("Born to Be Wild", 27.00, 9);
     
     //previous project commented out
     /*Song[] songs = {song1, song2, song3};
     double totalCost = 0;
     int numSongs = songs.length;
     
     for(int i = 0; i < 3; i++)
     {
         totalCost += songs[i].getPrice();
         
      }
     double averageCost = totalCost/numSongs;
     System.out.println("The average cost of a song is: " + averageCost);
     
     
     Movies movie1 = new Movies("The Sandlot", 9, 134);
     
     movie1.getDuration();
     movie1.timeConversion(movie1.getDuration());*/
     
     
     //creates media file and adds songs along with ratings onto it
     MediaFile.writeString(song2.getTitle() + " " + song2.getRating());
  
     MediaFile.writeString(song3.getTitle() + " " + song3.getRating());
     
     MediaFile.writeString(song1.getTitle() + " " + song1.getRating());
     
     MediaFile.saveAndClose();
     

     
     
     
   
    }
}