import java.io.*;
import java.util.*;

public class assignment2 {
	public static void main(String[] args) throws IOException {
		String f1 = "\"C:\\Users\\meaga\\Documents\\CODE\\CISC3130\\CSVFiles\\A1Charts.csv\"";
		String f2 = "\"C:\\Users\\meaga\\Documents\\CODE\\CISC3130\\CSVFiles\\UKCHARTS.csv\"";
		String f3 = "\"C:\\Users\\meaga\\Documents\\CODE\\CISC3130\\CSVFiles\\GLOBALCHARTS.csv\"";

		// to store multiple input files 
		ArrayList<String> files = new ArrayList<String>();
		files.add(f1);
		files.add(f2);
		files.add(f3);
		// file readers for multiple files
//		File file = new File("C:\\Users\\meaga\\Documents\\CODE\\CISC3130\\CSVFiles");
		String row;
		LinkedList<String> songList = new LinkedList<String>();
		
		try{
		for(int i=0; i<files.size(); i++){
			if (files.get(i) != null){
				BufferedReader reader = new BufferedReader(new FileReader(files.get(i)));
				while ((row = reader.readLine()) != null) {
					String[] data = row.split(",");
					String song = data[1];
					songList.add(song);
					reader.close();
			}
		}
		}
		}
		
		catch(Exception e){
			System.out.println("Unreadable");
		}
		
		
//	    if(file!=null){
//	        File[] listOfFiles = file.listFiles();
//
//	        if(listOfFiles!=null){
//
//	            for (int i = 0; i < listOfFiles.length; i++) {
//	                if (listOfFiles[i].isFile()) {
//	                      // DO work
//	                }
//	            }
//	        }
//	    }

		// read files in order and put items (songs) in a queue.
		Queue<String> orderedQueue = new LinkedList<String>();
		for (int j = 0; j < files.size(); j++) {
		}
		System.out.println(orderedQueue);


	// merge all the queues together into a linked list.
	// use stack to count the most recent inserted item.
}
}