import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;  // ���ϴ� ������ �Է�

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
		// ó�� �Է¹ޱ��� 3��¥�� �� ���

		while (true) {
			System.out.print("���ϴ� ũ�⸦ �Է��ϼ��� >> ");
			size = sc.nextInt();
			//������ �Է� 

			if (size == -1) {
				System.out.println("�����մϴ�");
				break;
				//-1 �̸� ����
				
			} else {
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < i + 1; j++)
						System.out.print("*");
					System.out.println();
				}
			}
			//���ϴ� size�� �´� * ���
			
		}
	}
}
