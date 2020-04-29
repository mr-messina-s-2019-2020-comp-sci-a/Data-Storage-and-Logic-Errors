
/**
 * Write a description of class Song here.
 *
 * @author (Garrett Harper)
 * @version (8/19/2019)
 */
public class Song 
{

    private String title;
    private int rating;
    private double price;
    
    public Song()
{
    rating = 0;
    
    title  = "";
    
    price = 0.0;
}

    public Song(String title)
{ this.title = title; }
       
    public Song(String title, int rating)
{ this.title = title;
this.rating = rating;}
       
public String getTitle() {
        return title;
    }
public void setTitle(String t) {
        title = t;
    }
    public double getPrice() {
 return price;
}
public void setPrice(double p) {
        price = p;
}

public int getRating() {
    return rating;
}
public void setRating(int r) {
    rating = r;
}
}
