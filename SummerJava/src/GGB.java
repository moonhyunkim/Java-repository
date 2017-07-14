import java.util.Scanner;

public class GGB {
	
	static String Win(String str) {
		String win = "";
		if(str.equals("가위")) 
			win = "바위";
		else if(str.equals("바위")) 
			win = "보";
		if(str.equals("보")) 
			win = "가위";
		return win;
	}
	
	static String Draw(String str) {
		String draw = "";
		if(str.equals("가위")) 
			draw = "가위";
		else if(str.equals("바위")) 
			draw = "바위";
		if(str.equals("보")) 
			draw = "보";
		return draw;
	}
	
	static String Lose(String str) {
		String lose = "";
		if(str.equals("가위")) 
			lose = "보";
		else if(str.equals("바위")) 
			lose = "가위";
		if(str.equals("보")) 
			lose = "바위";
		return lose;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2, str3;

		System.out.print("상대 선수가 낼 가위바위보를 순서대로 입력하세요 >>  ");
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
