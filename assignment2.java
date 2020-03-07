import java.io.*;
import java.util.*;

public class assignment2 {
	public static void main(String[] args) throws IOException {
		//store each file path into an array list
		File f1 = new File("C:\\Users\\meaga\\Documents\\CODE\\CISC3130\\CSVFiles\\A1Charts.csv");
		File f2 = new File("C:\\Users\\meaga\\Documents\\CODE\\CISC3130\\CSVFiles\\UKCHARTS.csv");
		File f3 = new File("C:\\Users\\meaga\\Documents\\CODE\\CISC3130\\CSVFiles\\GLOBALCHARTS.csv");

		// to store multiple input files
		ArrayList<File> files = new ArrayList<File>();
		files.add(f1);
		files.add(f2);
		files.add(f3);
		String row;
		//store track names
		LinkedList<String> songList = new LinkedList<>();

		//try-catch to take songs out from files and putting them into the list
		try {
			for (int i = 0; i < files.size(); i++) {
				if (files.get(i) != null) {
				BufferedReader reader = new BufferedReader(new FileReader(files.get(i)));
					while ((row = reader.readLine()) != null) {
						String[] data = row.split(",");
						String song = data[1];
						songList.add(song);
						//remove column name
						songList.remove("Track Name");
					}

					reader.close();
				}
			}
		}

		catch (Exception e) {
			System.out.println("Unreadable");
		}

		System.out.println(songList);
		
		//create a playlist object to add songs
		Playlist playlist = new Playlist(songList);
		//insert songs to playlist
		
		
		//create a historylist with a stack to track songs
		SongHistoryList log = new SongHistoryList();
		//add songs to play
		
	}	
	
	
	
	
}