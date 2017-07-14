package p170711;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyExam {
	public static void main(String[] args) {
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(new File("c:\\Users\\rlaan\\test.txt")));
			writer = new BufferedWriter(new FileWriter(new File("c:\\Users\\rlaan\\copy.txt")));
			while ((str = reader.readLine()) != null) {
				writer.write(str);
				writer.newLine();
			}
			System.out.println("���Ͼ��⿡ �����߽��ϴ�. \n");
			System.out.println("�� ���� ������ ��� Ȯ���� ���ñ� �ٶ��ϴ�.");
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
