/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main()
    {
        //creates string to parse through
        String songInfo = MediaFile.readString();
         int i = 0;
       while(i != songInfo.length())
       {
          String token = songInfo.substring(i, songInfo.indexOf("-", i)); 
        
        
          //if statement checks if each character in token returns an integer value
          //if value is less than 8, song is printed 
          if (Integer.valueOf(token.substring(token.length() - 1,token.length())) >= 8) 
          {   
             System.out.println("My Favorite Songs");
             System.out.println(token);
             
             
          }
          //updates the value of i
          i =  songInfo.indexOf("-", i) + 1;
       }
       
       
    }
}

