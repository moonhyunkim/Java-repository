package GUI_beginer;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/*�⺻������ Panel�� component�� ���̰� 
�� Panel�� Frame�� ���̴� ������ ��ģ��
*/

class PanelTest extends Frame{
	public PanelTest(String str) {
	// �⺻�����ڴ� �ƴϰ� str�� �Ű������� ������ ������
		super(str);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.lightGray);
		add(panel1);
	//window�� ��ӹް��ִ� Component�� �޼ҵ�
		setSize(300,300);
		setVisible(true);
	}
}

public class Panel1 {
	public static void main(String args[]) {
		new PanelTest("�г��׽�Ʈ");
	}
}
