package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		while (true) {
			try {

				System.out.println("나뉨수를 입력>>");
				dividend = scanner.nextInt();
				System.out.println("나눗수 입력 >> ");
				divisor = scanner.nextInt();

				System.out.println("나누면 " + dividend / divisor);
				break;
			}
			// 오류를 throw를 했을 때 catch 에서 받아준다
			catch (ArithmeticException e) {
				//e.printStackTrace();
				System.out.println("0으로 나누면 안됩니다. 다시 입력하세요   ");
			}
			catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요 ");
				scanner.nextLine(); // hello가버퍼에 남아있어서 계쏙 while문을 돌게 된다. 따라서 다시 입력을 하도록 한다. 
				//현재 scanner 의 버퍼에 있는 키 입력들을 읽어버린다.
			
			}
		}
	}
}
