package p170711;

import java.io.IOException;

public class ByteStreamExam {

	public static void main(String args[]) {
		int var = 0;
		System.out.println("���ڸ� �Է��ϼ��� (���� Enter)");
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
