package GUI_beginer;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

class CheckBox1 extends Frame{
	public CheckBox1(String str) {
		super("�c�c");
		Panel p = new Panel();
		Checkbox cbx1, cbx2, cbx3;
		
		cbx1 = new Checkbox("�̴�",true);
		cbx2 = new Checkbox("����");
		cbx3 = new Checkbox("���");
		
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4=new Checkbox("�̴�",group,true);
		Checkbox cbx5=new Checkbox("����",group,false);	
		Checkbox cbx6=new Checkbox("����",group,true);
		/*CheckboxGroup�� checkbox�� �ϳ��ι���
		true�� ���°� �ϳ��� ���� �� �ֵ��� �Ѵ�
		2���� true �� ������ ������ ���� ������ �ϳ��� check
		������ �ϳ��� ��ư�� true �ϸ� �ٸ���ư�� �ڵ�������
		false ���Ǳ� ������ ������ �߻����� �ʴ´�*/
		p.add(cbx4);
		p.add(cbx5);
		p.add(cbx6);

		add(p);
		setSize(180, 300);
		setVisible(true);

	}
}
public class CheckBox_RadioExam {
	public static void main(String[] args) 
	{
		new CheckBox1("üũ �ڽ� �׽�Ʈ");
	}

}
