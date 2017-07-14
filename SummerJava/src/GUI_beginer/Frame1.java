package GUI_beginer;

import java.awt.Frame;

public class Frame1 {
	public static void main(String args[]) {
		Frame f = new Frame();
		f.setTitle("frame 비기너");
		f.setBounds(100,400,400,300); 
		//(x, y , width, height)
		f.setVisible(true);
		//이건 필수 true : 창을 보여준다
	}
}
