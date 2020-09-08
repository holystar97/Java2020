package open;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.println("*** Up & Down 게임에 오셔서 환영합니다. ***");
		// TODO Auto-generated method stub
		while (true) {
			// 0~99 사이의 정수를 생성, 숫자 하나 생각
			int card = r.nextInt(100);
			// low, high
			int low = 0;
			int high = 99;
			int i = 1; // 카운팅 변수
			System.out.println("*** 수를 결정하였습니다 . 게임을 시작하세요. ***");
			while (true) {
				System.out.println(low + "-" + high);
				System.out.println(i + ">>");
				
				int n;
				// 사용자 입력 읽기
				try {
					n = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("숫자 정수만 입력 부탁드립니다.");
					scanner.nextLine(); // 입력된 키 모두 읽어버리기 
					continue;
				}
				if (n > high || n < low) {
					System.out.println("범위를 벗어났습니다. 다시 입력하세요  ");
				} else if (n > card) {
					System.out.println("더 낮은 숫자 입니다.");
					high = n;
				} else if (n < card) {
					System.out.println("더 높은 숫자입니다. ");
					low = n;
				} else {
					// n==card
					System.out.println(" 정답입니다. ");
					break;
				}
				i++;
			} // end of while

			// 계속 체크
			System.out.println("다시 하시겠습니까 ? (yes/no) >> ");
			String res = scanner.next();
			if (res.equals("no")) {
				break;
			}

		} // end of while

	}// end of main

}// end of class
