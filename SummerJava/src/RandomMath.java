import java.util.Scanner;

public class RandomMath {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice; // ������ ��
		int count = 0;

		System.out.print("1���� 1000������ �� �ϳ��� �Է��ϼ��� >> ");
		choice = sc.nextInt();

		while (true) {
			count++; // �����鼭 count ����
			int n = (int) (Math.random() * 1000) + 1;

			/*
			 * Math.random()�Լ��� 0~1(1������) ���� �Ҽ��� �������� �����ϴµ� �ű⿡ 1000�� �����ָ� 0~999������ ��� �Ҽ���
			 * ������� n�� ������ Ÿ���� int�̱� ������ ������Ÿ���� �����ֱ����� ��������ȯ (int)�� ���ָ� 0~999������ �ڿ����� �����ϴµ�
			 * �츮�� �Է��ϴ� ���� 1���� 1000�̴ϱ� �������� +1�� ���ָ� 1���� 1000������ ���� �Լ��� ����
			 */

			if (choice == n) {
				System.out.println(count+"�� ��ŭ ���� �̾ҽ��ϴ� ~");
				break;
			}
		}
	}
}
