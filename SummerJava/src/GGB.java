import java.util.Scanner;

public class GGB {
	
	static String Win(String str) {
		String win = "";
		if(str.equals("����")) 
			win = "����";
		else if(str.equals("����")) 
			win = "��";
		if(str.equals("��")) 
			win = "����";
		return win;
	}
	
	static String Draw(String str) {
		String draw = "";
		if(str.equals("����")) 
			draw = "����";
		else if(str.equals("����")) 
			draw = "����";
		if(str.equals("��")) 
			draw = "��";
		return draw;
	}
	
	static String Lose(String str) {
		String lose = "";
		if(str.equals("����")) 
			lose = "��";
		else if(str.equals("����")) 
			lose = "����";
		if(str.equals("��")) 
			lose = "����";
		return lose;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2, str3;

		System.out.print("��� ������ �� ������������ ������� �Է��ϼ��� >>  ");
		str1=sc.next();
		str2=sc.next();
		str3=sc.next();
		System.out.println(Win(str1)+", "+ Win(str2)+", " + Lose(str3));
		System.out.println(Win(str1)+", "+ Lose(str2)+", " + Win(str3));
		System.out.println(Lose(str1)+", "+ Win(str2)+", " + Win(str3));
		System.out.println(Draw(str1)+", "+ Draw(str2)+", " + Win(str3));
		System.out.println(Draw(str1)+", "+ Win(str2)+", " + Draw(str3));
		System.out.println(Win(str1)+", "+ Draw(str2)+", " + Draw(str3));
		
		
	

	}
}
