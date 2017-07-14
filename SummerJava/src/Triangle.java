import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;  // 원하는 사이즈 입력

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
		// 처음 입력받기전 3줄짜리 별 출력

		while (true) {
			System.out.print("원하는 크기를 입력하세요 >> ");
			size = sc.nextInt();
			//사이즈 입력 

			if (size == -1) {
				System.out.println("종료합니다");
				break;
				//-1 이면 종료
				
			} else {
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < i + 1; j++)
						System.out.print("*");
					System.out.println();
				}
			}
			//원하는 size에 맞는 * 출력
			
		}
	}
}
