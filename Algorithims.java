
/**
 * Write a description of class Algorithims here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithims
{
    public static void main() {
        double total = 0;
        String [] sharingFriends ={"Dawson",
                                   "Brian",
                                   "Sarah",
                                   "George",
                                   "Jenny"
        };
        for (int i = 0; i < sharingFriends.length; i++)
        {
            //System.out.println(sharingFriends[i]);
        }
        int [] daysBtwnPurchase =  {2, 5, 1, 2, 4, 2, 1 ,3};
        for (int t : daysBtwnPurchase)
        {
            total = total + t;
        }
        System.out.println(total/daysBtwnPurchase.length);
        
        Song[] topTenSongs = {new Song("h", 7),
                              new Song("new song", 1),
                              new Song("newer song", 3),
                              new Song("ok", 2),
                              new Song("song", 9),
                              new Song("t", 2),
                              new Song("song2", 4),
                              new Song("song3", 2),
                              new Song("song4", 6),
                              new Song("newest song", 10)
        };
        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle());
        }
        
        System.out.println("--BEFORE--");
        for (Song changeSong : topTenSongs) {
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());
        }
        
        System.out.println("--AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(topTenSongs[i].getTitle());
        }
        
        for (int i = 0; i < topTenSongs.length; i += 2) {
            System.out.println(topTenSongs[i].getTitle());
        }
        
        for (int i = 0; i < topTenSongs.length; i++){
            if ((i + 1) % 3 == 0) {
                topTenSongs[i].setPrice(.99); }
                else {
                topTenSongs[i].setPrice(1.29); }
                System.out.println(topTenSongs[i].getTitle() + " " + topTenSongs[i].getPrice());
            }
        
            Song bestSong = topTenSongs[0];
        for (Song d : topTenSongs){
            if(d.getRating() < bestSong.getRating()) {
                bestSong = d; }
            }
        System.out.println(bestSong.getTitle());
        
        Song worstSong = topTenSongs[0];
        for (Song f : topTenSongs){
            if(f.getRating() > worstSong.getRating()) {
                worstSong = f;}
        }
        System.out.println(worstSong.getTitle());
        
        Song secondSong = topTenSongs[0];
        for (Song e : topTenSongs){
            
        }
        
        for(Song s: topTenSongs) {
            System.out.println("Title: " + s.getTitle() + " Rating: " + s.getRating());
        }
        
        int bestRating = 0;
        int bestRatingi = 0;
        int worstRating = 11;
        int worstRatingi = 0;
        
        for(int i = 0; i < topTenSongs.length; i++) {
            if(topTenSongs[i].getRating() > bestRating) {
                bestRating = topTenSongs[i].getRating();
                bestRatingi = i;
            }
            if(topTenSongs[i].getRating() < worstRating) {
                worstRating = topTenSongs[i].getRating();
                worstRatingi = i;
            }
        }
        System.out.println("Highest Rated Song:");
        System.out.println(topTenSongs[bestRatingi].getTitle());
        System.out.println("Lowest Rated Song");
        System.out.println(topTenSongs[worstRatingi].getTitle());
        
        boolean deletedSong = false;
        int lastIndex = topTenSongs.length-1;
        for(int i = 0; i < topTenSongs.length; i++) {
            if(topTenSongs[i].getTitle().equals("song2")) {
                topTenSongs[i] = null;
                deletedSong = true;
                lastIndex = lastIndex -1;
            }
            else if(deletedSong) {
                topTenSongs[i-1] = topTenSongs[i];
                topTenSongs[i] = null;
            }
        }
        
        for(int i = 0; i <= lastIndex; i++) {
            System.out.println(topTenSongs[i].getTitle());
        }
        
        int insert =4;
        for(int i = lastIndex + 1; i >= 0; i--) {
            if(i== insert) {
                topTenSongs[i] = new Song("song5");
                lastIndex++;
                break;
            }
            else {
                topTenSongs[i] = topTenSongs[i-1];
            }
        }
        
        for(int i = 0; i <= lastIndex; i++) {
            System.out.println(topTenSongs[i].getTitle());
        }
        
        
}
}