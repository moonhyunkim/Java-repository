import java.util.Scanner;

public class RandomMath {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice; // 선택할 수
		int count = 0;

		System.out.print("1에서 1000사이의 수 하나를 입력하세요 >> ");
		choice = sc.nextInt();

		while (true) {
			count++; // 뽑으면서 count 증가
			int n = (int) (Math.random() * 1000) + 1;

			/*
			 * Math.random()함수가 0~1(1미포함) 사이 소수를 무작위로 생성하는데 거기에 1000을 곱해주면 0~999까지의 모든 소수가
			 * 만들어짐 n은 데이터 타입이 int이기 때문에 데이터타입을 맞춰주기위해 강제형변환 (int)를 해주면 0~999까지의 자연수를 생성하는데
			 * 우리가 입력하는 수는 1부터 1000이니까 마지막에 +1을 해주면 1부터 1000사이의 랜덤 함수를 생성
			 */

			if (choice == n) {
				System.out.println(count+"번 만큼 수를 뽑았습니다 ~");
				break;
			}
		}
	}
}
