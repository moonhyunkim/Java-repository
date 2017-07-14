package p170711;

import java.io.*;

public class RandomFileTest {
	public static void main (String[] args) {
		String output ="";
		String str="";
		try {
			RandomAccessFile file =new RandomAccessFile("C:\\Users\\rlaan\\test.txt","rw");
			String k = new String("Bye Bye Java");
			file.seek(file.length());
			file.write(k.getBytes()); 
			file.writeChar('\n');
			file.seek(0);
			while(file.getFilePointer() < file.length()) {
				output += file.getFilePointer();
				str = file.readLine();
				output += str + "\n";
				System.out.println(output);
			}
			file.close();
		}catch(Exception e) {
		System.out.println("Error : "+ e.toString());
		}
		System.exit(0);
	}
	
}
