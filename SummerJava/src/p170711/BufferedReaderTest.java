package p170711;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {
			String str = "";
			BufferedReader reader = null;
			
			try {
				while(true) {
					System.out.println("���ڿ��� �Է��ϰ�(�ߴ��� ��) : ");
					reader = new BufferedReader(new InputStreamReader(System.in));
					str = reader.readLine();
					if (str.equals("��"))
						break;

					// �Է��� ���ڿ� ���
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("����");
				}
	
	//���� ������Ҷ��� oepn close�� �ʿ��ϴ�

}
