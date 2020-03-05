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
		//create a queue with all songs
		Queue<String> songList = new LinkedList<String>();

		//try-catch to take songs out from files and putting them into the list
//		System.out.println(files);
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
//
		catch (Exception e) {
			System.out.println("Unreadable");
		}

		System.out.println(songList);

		// use stack to count the most recent inserted item.
	}
}
