package p170711;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		String str = "";
		File file = new File("C:\\Users");
		if(file.exists()) {
			str+="���ϸ� : "+file.getName() + "\n" + "������ ũ�� : "+file.length()+"\n" 
			+ "������ ������ : "+file.lastModified() +"\n"+ "�θ� ���丮 : " + file.getParent()+"\n";
			                                                       
		}
		else {
			str = "��������� �������� �ʽ��ϴ�.";
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
