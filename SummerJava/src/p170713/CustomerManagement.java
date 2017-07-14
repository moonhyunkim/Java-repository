package p170713;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;

class LayoutSetting extends Frame {
	Panel panel[];
	Label lblTitle, lblName, lblHeight, lblWeight, lblSex, lblAge;
	TextField tfName, tfHeight, tfAge, tfWeight;
	Button btnSave, btnSearch, btnDelete, btnUpdate, btnReset;
	List list;
	Checkbox chMale, chFemale;
	CheckboxGroup chGroup;

	public LayoutSetting() {
		super("회원 관리");
		panel = new Panel[12];
		for (int i = 0; i < panel.length; i++) {
			panel[i] = new Panel();
		}
		lblTitle = new Label("회원관리", Label.CENTER);
		Font font = new Font("dialog", Font.BOLD, 20);
		lblTitle.setFont(font);
		lblTitle.setForeground(new Color(123, 54, 32));
		lblName = new Label("이 름");
		lblAge = new Label("연령");
		lblHeight = new Label("키");
		lblWeight = new Label("체중");
		tfName = new TextField("");
		tfAge = new TextField("");
		tfHeight = new TextField("");
		tfWeight = new TextField("");
		lblSex = new Label("성별");
		chMale = new Checkbox("Male");
		chFemale = new Checkbox("FeMale");
		btnSave = new Button("저장");
		btnSearch = new Button("검색");
		btnDelete = new Button("삭제");
		btnUpdate = new Button("수정");
		btnReset = new Button("지우기");
		list = new List(7, false);
		chGroup = new CheckboxGroup();
		chMale = new Checkbox("Male", chGroup, false);
		chFemale = new Checkbox("FeMale", chGroup, false);

		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String str = list.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str);
				tfName.setText(st.nextToken());
				tfAge.setText(st.nextToken());
				tfHeight.setText(st.nextToken());
				tfWeight.setText(st.nextToken());
				String sex = st.nextToken();
				if (sex.equals("F")) {
					chFemale.setState(true);
				} else {
					chMale.setState(true);
				}
			}
		});

		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				//textFeild의 component를 return해주는 component의 메소드 (java.awt.component.textfield)
				Member1DAO dao = new Member1DAO();
				Member1DTO dto = new Member1DTO();
				try {
					
				}
			}
		});
		
	}

	public void lanchFrame() {
		panel[1].setLayout(new GridLayout(2, 1));
		panel[1].add(lblName);
		panel[1].add(lblHeight);

		panel[2].setLayout(new GridLayout(2, 1));
		panel[2].add(tfName);
		panel[2].add(tfHeight);

		panel[3].setLayout(new BorderLayout());
		panel[3].add(panel[1], "West");
		panel[3].add(panel[2], "Center");
		panel[3].add(new Label(" "), "East");

		panel[4].setLayout(new GridLayout(2, 1));
		panel[4].add(lblAge);
		panel[4].add(lblWeight);

		panel[5].setLayout(new GridLayout(2, 1));
		panel[5].add(tfAge);
		panel[5].add(tfWeight);

		panel[6].setLayout(new BorderLayout());
		panel[6].add(panel[4], "West");
		panel[6].add(panel[5], "Center");

		panel[7].setLayout(new GridLayout(1, 2));
		panel[7].add(panel[3]);
		panel[7].add(panel[6]);

		panel[8].add(lblSex);
		panel[8].add(chMale);
		panel[8].add(chFemale);

		panel[9].setLayout(new BorderLayout());
		panel[9].add(lblTitle, "North");
		panel[9].add(panel[7], "Center"); // 방위는 첫글자 대문자로
		panel[9].add(panel[8], "South");

		panel[10].setLayout(new GridLayout(1, 5));
		panel[10].setBackground(Color.BLACK);
		panel[10].setForeground(Color.WHITE);
		panel[10].add(new Label("이 름     "));
		panel[10].add(new Label("나 이     "));
		panel[10].add(new Label("체 중     "));
		panel[10].add(new Label(" 키       "));
		panel[10].add(new Label("성 별     "));

		panel[11].setLayout(new BorderLayout());
		panel[11].add(panel[10], "North");
		panel[11].add(list, "Center");

		panel[0].add(btnSave);
		panel[0].add(new Label(" "));
		panel[0].add(btnSearch);
		panel[0].add(new Label(" "));
		panel[0].add(btnDelete);
		panel[0].add(new Label(" "));
		panel[0].add(btnUpdate);
		panel[0].add(new Label(" "));
		panel[0].add(btnReset);

		add(panel[9], "North");
		add(panel[11], "Center");
		add(panel[0], "South");
		setSize(400, 300);
		pack();
		setVisible(true);
		displayAll();

	}
 
	public void displayAll() {

		// 리스트 클리어
		list.removeAll();

		Member1DAO dao = new Member1DAO();
		ArrayList<Member1DTO> xxx = dao.listAll();
		for (Member1DTO dto : xxx) {
			String name = dto.getName();
			int age = dto.getAge();
			int height = dto.getHeight();
			int weight = dto.getWeight();
			String sex = dto.getSex();

			list.add(name + "             " + age + "              " + weight + "                " + height
					+ "               " + sex);
		}

	}// displayAll()
}

public class CustomerManagement {
	public static void main(String[] args) {
		LayoutSetting cmng = new LayoutSetting();
		cmng.lanchFrame();
	}
}
