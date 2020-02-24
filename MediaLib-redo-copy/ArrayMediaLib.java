

/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public static void main()
    { 
        int[] daysBtwnPurchase ={2, 5, 1, 2, 4, 2, 1, 3};
        
        double total = 0;
        double average = 0; 
        for (int day : daysBtwnPurchase)
         {
            total += day;
            average = total / daysBtwnPurchase.length;
            
        }
        //System.out.println(average);
        
        
        Song[] topTenSongs = {new Song("I love rock and roll"),
                              new Song("One"),
                              new Song("Sweet Child O' Mine"),
                              new Song("Smoke On the Water"),
                              new Song("Back in Black"),
                              new Song("The Twist"),
                              new Song("Mack the Knife"),
                              new Song("Smells Like Teen Spirit"),
                              new Song("Livin On A Prayer"),
                              new Song("Bohemian Rhapsody")
        };
        /*// for each loop that displays titles and prices
        for (Song s : topTenSongs)
        {
            System.out.println(s.getTitle());
            System.out.println(s.getPrice());
        }*/
        
        
        //for loop that changes every third song to .99 cents
        for(int i = 0; i < topTenSongs.length; i++)
        {
            if((i+1) % 3 == 0)
            {
               topTenSongs[i].setPrice(0.99);
            }
            else
            {
                topTenSongs[i].setPrice(1.29);
            }
            //System.out.println(topTenSongs[i].getPrice());
        }
        /*// for loop that displays every other song
        for ( int i = 0; i < topTenSongs.length; i += 2)
        { 
             System.out.println(topTenSongs[i].getTitle());
        }
        */
        /*int index = SongFinder.findTitle(null, null);
        if (index >=0)
        {
            System.out.println("Found " + topTenSongs[index].getTitle());
        }
        else
        {
            System.out.println("Song not found!");
        }*/
        
        /*int index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
        if(index >= 0)
        {
            System.out.println("Discount found " + topTenSongs[index].getTitle());
            
        }
        else
        {
            System.out.println("No songs are discounted");
        }
        */
        System.out.println("--Find last song--");
        int index = SongFinder.getIndexLastTitle (topTenSongs);
        if (index >= 0)
        {
            System.out.println("Last Title: " + topTenSongs[index].getTitle());
        }
        else
        {
            System.out.println("You have a blank title!");
        }
        
        
    }
}
