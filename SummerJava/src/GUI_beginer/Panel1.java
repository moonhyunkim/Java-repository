package GUI_beginer;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/*기본적으로 Panel에 component를 붙이고 
이 Panel을 Frame에 붙이는 과정을 거친다
*/

class PanelTest extends Frame{
	public PanelTest(String str) {
	// 기본생성자는 아니고 str을 매개변수로 가지는 생성자
		super(str);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.lightGray);
		add(panel1);
	//window가 상속받고있는 Component의 메소드
		setSize(300,300);
		setVisible(true);
	}
}

public class Panel1 {
	public static void main(String args[]) {
		new PanelTest("패널테스트");
	}
}
