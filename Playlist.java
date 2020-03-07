import java.util.*;

public class Playlist {
	  private Song first;
	  Queue<Song> playlist;
	  public Playlist(LinkedList<String> songList){
	    // constructor for creating a new list
		  playlist = new LinkedList<Song>();
	  }
	  public void addSong(Song s){
		  playlist.add(s);
	  }
	  public Song listenToSong(){
	    // retrieves the next song to listen to
		  return first;
	  }
	}