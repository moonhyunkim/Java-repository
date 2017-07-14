package GUI_beginer;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

class CheckBox1 extends Frame{
	public CheckBox1(String str) {
		super("®c®c");
		Panel p = new Panel();
		Checkbox cbx1, cbx2, cbx3;
		
		cbx1 = new Checkbox("ÀÌ´ë",true);
		cbx2 = new Checkbox("°­³²");
		cbx3 = new Checkbox("Äá´ë");
		
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4=new Checkbox("ÀÌ´ë",group,true);
		Checkbox cbx5=new Checkbox("°­³²",group,false);	
		Checkbox cbx6=new Checkbox("Á¾·Î",group,true);
		/*CheckboxGroupÀº checkbox¸¦ ÇÏ³ª·Î¹­¾î
		trueÀÎ »óÅÂ°¡ ÇÏ³ª¸¸ ÀÖÀ» ¼ö ÀÖµµ·Ï ÇÑ´Ù
		2°³¸¦ true ÇØ ³õÀ¸¸é ¿¡·¯´Â ³ªÁö ¾ÊÁö¸¸ ÇÏ³ª¸¸ check
		ÀÌÀ¯´Â ÇÏ³ªÀÇ ¹öÆ°À» true ÇÏ¸é ´Ù¸¥¹öÆ°Àº ÀÚµ¿ÀûÀ¸·Î
		false °¡µÇ±â ¶§¹®¿¡ ¿¡·¯°¡ ¹ß»ýÇÏÁö ¾Ê´Â´Ù*/
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
		new CheckBox1("Ã¼Å© ¹Ú½º Å×½ºÆ®");
	}

}
