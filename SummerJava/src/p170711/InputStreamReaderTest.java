package p170711;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		int var = 0;
		Reader input = null;
		System.out.println("입력을 하세요!");
		
		try {
			input = new InputStreamReader(System.in);
			while(true) {
				var = input.read();
				if(var ==13)
					break;
				System.out.print((char)var);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
