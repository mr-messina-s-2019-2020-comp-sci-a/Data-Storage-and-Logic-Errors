
/**
 * Write a description of class SongFinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SongFinder
{
    public static int findTitle(Song[] songs, String target){
        String word = "";
        int test = -1;
        for (int i = 0; i < songs.length; i++){

            word = songs[i].getTitle();
            if (word.equals(target)) {
                test = i;
                return i;
         }
}
 return test; } 
 public static int getIndexLastDiscount(Song[] songs, double compare){
    if (songs == null) return -1;

int found = -1;
    for (int i = songs.length - 1; i >=0; i--) {
        if (songs[i].getPrice() < compare) {
            return found = i;
        }
        else {
           found = -1; // to show none found
        }
    }
    return found;
}
public static int getIndexLastTitle(Song[] songs)
{
    int i = 0;
    if (songs == null) {
       return -1;
    }
    for (i = 0; i < songs.length - 1; i++) {
       // skip if no title
       if (songs[i].getTitle().equals("")) {
           return -1;
       }
    }
    return i;
}
}
