package p170709;

import java.util.Scanner;

public class ExceptioneExam2 {
	public static void main(String args[]) {

		int answer = (int) (Math.random() * 100) + 1;
		int input, count = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			try {
				input = sc.nextInt();
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. " + "다시 값을 입력해주세요.");
				continue;
			}
//여기서 스캐너 객체를 while문 밖에서 선언하면 에러가 난다.
//아마도 catch문을 찾아 수행하고 문장이 반복될때 try-catch 문에서는 안에다 객체선언을 다시해줘야 하는갑다

			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요");
				count++;
			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요");
				count++;
			} else {
				count++;
				System.out.println("맞췄습니다");
				System.out.println("시도한 횟수는 " + count + "번 입니다");
				break;
			}
		}
	}
}
