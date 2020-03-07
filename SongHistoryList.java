import java.util.*;

public class SongHistoryList {
  public Song first;

  Stack<Song> songhistory;
  public void SongHistoryList(){
    // constructor for creating a new list
	  songhistory = new Stack<>();
  }
  public void addSong(Song s){
	  s = first;
	  first=s.next;
  }
  public Song lastListened(){
    // retrieves the next song to listen to
	  return first;
	  
  }
}