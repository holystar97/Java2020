package test;

import java.util.Scanner;

public class ScannerEx {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("이름, 도시 ,나이, 체중, 독신 여부 입력 ");
		Scanner scanner= new Scanner(System.in);
		
		String name=scanner.next();
		String city=scanner.next();
		int age=scanner.nextInt();
		double weight=scanner.nextDouble();
		boolean isSingle=scanner.nextBoolean();
		
		System.out.println("이름은 "+ name + " ,");
		System.out.println("도시는  "+ city + " ,");
		System.out.println("나이는  "+ age + " ,");
		System.out.println("체중은  "+ weight + " ,");
		System.out.println(" 독신여부는  "+isSingle + "입니다.");
		
		
	}

}
