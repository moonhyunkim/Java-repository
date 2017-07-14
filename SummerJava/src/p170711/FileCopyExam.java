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
			System.out.println("파일쓰기에 성공했습니다. \n");
			System.out.println("두 개의 파일을 열어서 확인해 보시기 바랍니다.");
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
