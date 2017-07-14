package p170711;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {
			String str = "";
			BufferedReader reader = null;
			
			try {
				while(true) {
					System.out.println("문자열을 입력하고(중단은 끝) : ");
					reader = new BufferedReader(new InputStreamReader(System.in));
					str = reader.readLine();
					if (str.equals("끝"))
						break;

					// 입력한 문자열 출력
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("종료");
				}
	
	//파일 입출력할때는 oepn close가 필요하다

}
