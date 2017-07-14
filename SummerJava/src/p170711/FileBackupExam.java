package p170711;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class FileBackupExam extends JFrame implements ActionListener {
	JButton backupBtn = null;
	JFileChooser fc = null;

	public FileBackupExam() {
		super("���� ó��");
		setLayout(new FlowLayout());
		backupBtn = new JButton("���");

		backupBtn.addActionListener(this);

		add(backupBtn);

		setSize(200, 80);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		fc = new JFileChooser();
		int result = fc.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();

			result = JOptionPane.showConfirmDialog(this, f.getName() + " ����", "���� Ȯ��", JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.OK_OPTION) {
				BufferedReader reader = null;
				BufferedWriter writer = null;
				String str = "";
				try {
					reader = new BufferedReader(new FileReader(f));
					writer = new BufferedWriter(new FileWriter(new File("c:\\" + f.getName())));
					while ((str = reader.readLine()) != null) {
						writer.write(str);
						writer.newLine();
					}
					JOptionPane.showMessageDialog(this, "����� �����߽��ϴ�.", "�۾� ����", JOptionPane.WARNING_MESSAGE);
					reader.close();
					writer.close();
				} catch (Exception ee) {
					ee.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(this, "��� ���", "���� ���� ����", JOptionPane.WARNING_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "��� ���", "��� �۾� ���", JOptionPane.WARNING_MESSAGE);
		}
	}

	public static void main(String args[]) {
		new FileBackupExam();
	}

}
