package GUI_beginer;

import java.awt.Frame;

class FrameTest extends Frame{
	public FrameTest() {
		super("�ι�° ������ �Դϴ�");
		// Frame�� �⺻������ Frame(String title)  
		setBounds(100,100,300,400);
		setVisible(true);
		// Frame�� �����ɶ� �⺻������ inVisible�����̴�
		
	/*	 setbounds, setSize, setVisible�� 
		frame�� �޼ҵ尡 �ƴ� frame�� ��ӵ�
		java.awt.window�� �޼ҵ��̴�*/
	}
}

public class Frame2 {
	public static void main(String args[]) {
		FrameTest f2 = new FrameTest();
	}
}
// ���� ���� ���� ���̴� ����