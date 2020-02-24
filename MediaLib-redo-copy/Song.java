
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    private double totalCost;
    private int numSongs;
    private int totalRatings;
    private double averageCost;
    

    public Song(String title)
    {
        this.title = title;
    }
    
    public Song(String title, int rating)
    {
        this.title = title;
        this.rating = rating;
    }
    
    public Song(String title, double price, int rating)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
        averageCost = totalCost / numSongs;
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
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    public void addToFavorite()
    {
        favorite = true; 
    }
    
    public double getAverageCost()
    {
        averageCost = totalCost / numSongs;
        return averageCost;
    }
}
