package GUI_beginer;

import java.awt.Frame;

class FrameTest extends Frame{
	public FrameTest() {
		super("두번째 프레임 입니다");
		// Frame의 기본생성자 Frame(String title)  
		setBounds(100,100,300,400);
		setVisible(true);
		// Frame은 생성될때 기본적으로 inVisible상태이다
		
	/*	 setbounds, setSize, setVisible은 
		frame의 메소드가 아닌 frame이 상속된
		java.awt.window의 메소드이다*/
	}
}

public class Frame2 {
	public static void main(String args[]) {
		FrameTest f2 = new FrameTest();
	}
}
// 보통 가장 많이 쓰이는 형태