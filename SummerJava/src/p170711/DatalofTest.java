package p170711;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DatalofTest  {
	public static void main(String[] args ) throws IOException  {
	    DataOutputStream dataout = new DataOutputStream(new FileOutputStream("C:\\Users\\rlaan\\test.txt")); 
	    dataout.writeInt(123);
  	    dataout.writeChar('k');
  	    dataout.writeDouble(123.4);
  	    dataout.close();
  	
		DataInputStream datain =  new DataInputStream(new FileInputStream("C:\\Users\\rlaan\\test.txt")); 
		
  		System.out.println(datain.readInt());
  		System.out.println(datain.readChar());
  		System.out.println(datain.readDouble());
  		datain.close();

	}
}
