
/**
 * Write a description of class Movies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movies
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;

    /**
     * Constructor for objects of class Movies
     */
    public Movies(String title, int rating, int duration)
    {
        this.title = title ;
        this.rating = rating;
        this.duration = duration;
        
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public int getRating()
    {
      return rating;  
    }
    
    public void setRating(int r)
    {
     rating = r;   
    }
    
    public int getDuration()
    {
        return duration;
    }
    
    public void timeConversion (int min )
    {
        if(min % 60 < 1)
        {
           System.out.println("The movie is one hour long"); 
        }
        
        else
        {
           min = min % 60; 
           System.out.println("The movie is one hour and " + min + " minutes long");
        }
       
    }
    
}
