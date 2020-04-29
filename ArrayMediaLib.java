public class ArrayMediaLib
{
    public static void main()
    {
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
        
        Song[] topTenSongs = {new Song("h", 5),
                              new Song("new song", 7),
                              new Song("newer song", 10),
                              new Song("ok", 4),
                              new Song("song", 5),
                              new Song("t", 8),
                              new Song("song2", 2),
                              new Song("song3", 1),
                              new Song("song4", 7),
                              new Song("newest song", 6)
        };
        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle());
        }
        
        System.out.println("--BEFORE--");
        for (Song changeSong : topTenSongs) {
            changeSong = new Song("test", 6);
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
        int index = SongFinder.findTitle(topTenSongs, "newer song");
        if (index >=0 ) {
            System.out.println("Found " + topTenSongs[index].getTitle());
        }
        else  {
            System.out.println("Song not found!");
            System.out.println(index);
        }
        index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
        if (index >= 0 ) {
            System.out.println("Discount found " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("No songs are discounted");
            System.out.println(index);
        }
        
        System.out.println("--Find last song --");
        index = SongFinder.getIndexLastTitle(topTenSongs);
        if (index >= 0 ) {
        System.out.println("Last title: " + topTenSongs[index].getTitle());
         }
        else {
        System.out.println("You have a blank title!");
        }
}

}

