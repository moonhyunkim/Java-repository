package GUI_beginer;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

class Button1 extends Frame{
	Button btn1,btn2,btn3;
	public Button1(String str) {
		
		super(str);
	
		Panel p = new Panel();
		btn1=new Button("����");
		btn2=new Button("����");
		btn3=new Button("����");
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		add(p);
		
		btn2.setEnabled(false); 
		//��ư ��Ȱ��ȭ
		
		setSize(300,300);
		setVisible(true);
		
	}
}
public class ButtonExam1 {
	public static void main(String[] args) {
		new Button1("�׽���");
	}
}
