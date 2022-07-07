package readwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class RandomWrite {

	public static void main(String[] args) throws IOException {
		randomToFile("src\\data\\random.txt");
	}
	
	public static void randomToFile(String path) throws IOException {
		
		
		File fl = new File(path);
		FileWriter fw = new FileWriter(fl,true);
		FileOutputStream fo = new FileOutputStream(fl);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Random rand = new Random(); //Creating obj for Random Class
		int[] nums = new int[500]; // creating integer array
		for(int i=0; i<500; i++) {
			nums[i] = 1 + rand.nextInt(1000); //creating random values in range 100,1000
			
			bw.write(nums[i]+"");
			bw.newLine();
			}
		bw.write("HEY");
		bw.close();
}
}
