package readwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Filereadwrite {

	public static void main(String[] args) throws IOException {
		
		readFile("src\\data\\abc.properties");
		writeFile("src\\data\\new.txt", "Prasanth");
		
		
	}
	public static void readFile(String path) throws IOException {
		
		Properties prop = new Properties();
		File fl = new File(path);
		FileInputStream fi = new FileInputStream(fl);
		prop.load(fi);
		System.out.println(prop.getProperty("username"));
	}
	
	public static void writeFile(String path, String data) throws IOException {
		Properties prop = new Properties();
		File fl = new File(path);
		FileWriter fw = new FileWriter(fl);
		FileOutputStream fo = new FileOutputStream(fl);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(data);
		bw.write("I am Arun");
		
		bw.newLine();
		bw.close();
		
	}

}
