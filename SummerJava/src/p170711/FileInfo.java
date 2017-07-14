package p170711;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		String str = "";
		File file = new File("C:\\Users");
		if(file.exists()) {
			str+="파일명 : "+file.getName() + "\n" + "파일의 크기 : "+file.length()+"\n" 
			+ "마지막 수정일 : "+file.lastModified() +"\n"+ "부모 디렉토리 : " + file.getParent()+"\n";
			                                                       
		}
		else {
			str = "헤당파일이 존재하지 않습니다.";
		}
		
		System.out.println(str);
		System.out.println("==================");
		File dir = new File(".");
		String[] strs = dir.list();
		for(int i = 0; i< strs.length; i++) {
			System.out.println(strs[i]);
		}

	}
}
