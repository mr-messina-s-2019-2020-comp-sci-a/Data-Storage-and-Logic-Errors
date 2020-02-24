
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main()
    {
        
        for(int i = 0; i < 5; i++)
        {
            String songInfo = MediaFile.readString();
            System.out.print("Title: " + songInfo.substring(0, songInfo.indexOf("|")) + " - ");
            System.out.println("Rating: " + songInfo.substring(songInfo.indexOf("|"), songInfo.length())); 
        }
        
        
        
        
       
    }
}
