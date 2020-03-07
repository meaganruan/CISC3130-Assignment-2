import java.util.*;

public class Playlist {
	  private Song first;
	  LinkedList<Song> playlist;
	  public Playlist(){
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