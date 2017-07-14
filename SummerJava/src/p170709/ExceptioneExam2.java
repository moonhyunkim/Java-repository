package p170709;

import java.util.Scanner;

public class ExceptioneExam2 {
	public static void main(String args[]) {

		int answer = (int) (Math.random() * 100) + 1;
		int input, count = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			try {
				input = sc.nextInt();
			} catch (Exception e) {
				System.out.println("��ȿ���� ���� ���Դϴ�. " + "�ٽ� ���� �Է����ּ���.");
				continue;
			}
//���⼭ ��ĳ�� ��ü�� while�� �ۿ��� �����ϸ� ������ ����.
//�Ƹ��� catch���� ã�� �����ϰ� ������ �ݺ��ɶ� try-catch �������� �ȿ��� ��ü������ �ٽ������ �ϴ°���

			if (input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���");
				count++;
			} else if (input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���");
				count++;
			} else {
				count++;
				System.out.println("������ϴ�");
				System.out.println("�õ��� Ƚ���� " + count + "�� �Դϴ�");
				break;
			}
		}
	}
}
