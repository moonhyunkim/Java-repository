package p170711;

import java.io.File;

public class FileDeleteExam {
	public static void main(String[] args) {
		delete("C:\\Users\\rlaan\\a.txt");
	}
	
	public static void delete(String filename) {
		File f = new File(filename);
		if (!f.exists()) {
			System.out.println("Delete : "+"������ ã�� �� �����ϴ� : " + filename);
			System.exit(0);
		}
		
		if(!f.canWrite()) {
			System.out.println("Delete : ���� ������ �Ǿ� ������ �� �����ϴ�. : " + filename);
			System.exit(0);
		}
		if(f.isDirectory()) {
			String []files = f.list();
			if (files.length > 0)
				System.out
				.println("Delete : ���丮�� ��� ���� �ʽ��ϴ�. : " + filename);
				System.exit(0);

			
		}
		boolean success = f.delete();
		if (!success)
			System.out.println("Delete :  ���� ���� ����");
		else
			System.out.println("Delete :  ���� ���� ����");
	}
}
