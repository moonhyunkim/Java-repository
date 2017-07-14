package p170711;

import java.io.File;

public class FileDeleteExam {
	public static void main(String[] args) {
		delete("C:\\Users\\rlaan\\a.txt");
	}
	
	public static void delete(String filename) {
		File f = new File(filename);
		if (!f.exists()) {
			System.out.println("Delete : "+"파일을 찾을 수 없습니다 : " + filename);
			System.exit(0);
		}
		
		if(!f.canWrite()) {
			System.out.println("Delete : 쓰기 방지가 되어 삭제할 수 없습니다. : " + filename);
			System.exit(0);
		}
		if(f.isDirectory()) {
			String []files = f.list();
			if (files.length > 0)
				System.out
				.println("Delete : 디렉토리가 비어 있지 않습니다. : " + filename);
				System.exit(0);

			
		}
		boolean success = f.delete();
		if (!success)
			System.out.println("Delete :  파일 삭제 실패");
		else
			System.out.println("Delete :  파일 삭제 성공");
	}
}
