package p170711;

import java.io.IOException;

public class ByteStreamExam {

	public static void main(String args[]) {
		int var = 0;
		System.out.println("문자를 입력하세요 (종료 Enter)");
		try {
			var = System.in.read();
			while(var!=13) {
				System.out.print((char)var);
				var =System.in.read();
			}
		}catch(IOException e	) {
			e.printStackTrace();
		}
	}
}
