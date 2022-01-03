package ProjectEuler;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LargeSum{
	public static void main(String[] args)throws FileNotFoundException{
		File file = new File("/Users/jacksonding/Documents/Coding/ProjectEuler/Numbers.txt");
		Scanner myScanner = new Scanner(file);

		ArrayList<String> list = new ArrayList<String>();

		try{
			while(myScanner.hasNextLine()){
				String data = myScanner.nextLine();
				list.add(data);
			}
			myScanner.close();
		}catch(Exception ex){
			System.out.println("there was an error");
			ex.printStackTrace();
		}
		long result = 0;
		for(int i = 0; i<list.size(); i++){

			result += Long.parseLong(list.get(i).substring(0,10));
			
		}
		System.out.println(String.valueOf(result).substring(0,10));


		
	}
}