

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
       String songInfo = MediaFile.readString();
       int titleStart = 0;
       int titleEnd = songInfo.indexOf("|", titleStart) - 2;
    while(songInfo !=null){
        
        System.out.println(songInfo);
        System.out.println(titleStart);
        String title = songInfo.substring(titleStart, titleEnd);
        System.out.println(title);
        titleStart = songInfo.indexOf("|") + 1;
        System.out.println(titleStart);
        System.out.println(songInfo.indexOf("|", titleStart));
        System.out.println(songInfo.length() - 1 == songInfo.indexOf("|", titleStart));
        if (songInfo.length() - 1 == songInfo.indexOf("|", titleStart)){
        songInfo = null;}
    }   
           
    /*for (int x = 0; x < songInfo.length() ; x++){
           int start = songInfo.indexOf(" : ");
           if (start == -1) {break;}
           start = songInfo.indexOf(" : ") +1;
           int end = songInfo.indexOf(" | ", start);
           String title = songInfo.substring(start+1, end);
           System.out.println(title);
           songInfo = null;
    }*/
}
}
