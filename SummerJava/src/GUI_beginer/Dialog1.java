package GUI_beginer;

import java.awt.Dialog;
import java.awt.Frame;

class DialogTest extends Frame{
	static final long serialVersionUID=1;
	public DialogTest() {
		super("���̾�α� �׽�Ʈ");
		Frame a = new Frame();
		Dialog d = new Dialog(a, "�������..");
		setBounds(0,0,400,400);
		setVisible(true);
		d.setSize(200,200);
		d.setVisible(true);
		
	}
}
public class Dialog1 {
	public static void main(String args[]) {
		new DialogTest();
	}
}
