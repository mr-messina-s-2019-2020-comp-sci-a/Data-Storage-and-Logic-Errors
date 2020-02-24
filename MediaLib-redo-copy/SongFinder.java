
/**
 * Write a description of class SongFinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class SongFinder
{
   public static int findTitle(Song[] songs, String target)
   {
     String word = "";
     for (int i = 0; i < songs.length; i++)
      {
       word = songs[i].getTitle();
       /*System.out.println(word + " --Word");
       System.out.println(target + " --target");*/
       if (word == target)
       {
        return i;   
       }
       
       
       }
     return -1; 
   }
   
   
   public static int getIndexLastDiscount(Song[]songs, double compare)
   {
       if (songs == null)
       {
           return -1;
       }
       
       int found = -1; 
       for(int i = songs.length - 1; i >= 0; i --)
       {
           //System.out.println(songs[i].getPrice() + " --price");
           //System.out.println(compare + " --compare");
           if (songs[i].getPrice() < compare)
           {
               found = i;
           }
       }
       return found;
      
   }
   
   
   public static int getIndexLastTitle(Song[]songs)
   {
    int i;
    if (songs == null)
    {
        return -1;
       
    }
    
    for (i = 0; i < songs.length - 1; i++)
    {//skip if no title
        if (songs[i].getTitle().equals(""))
        {
            return -1;
        }
    }
    return i;
   }
   
   
   
}