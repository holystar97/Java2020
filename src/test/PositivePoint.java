package test;

import java.util.Scanner;

interface Stack{
	
	int length();
	int capacity();
	String pop();
	boolean push(String val);

	public static void main(String[] args) {
		System.out.println("총 스택 저장 공간의 크기 입력  >> ");
		Scanner scan= new Scanner(System.in);
		int num= scan.nextInt();
		while(true){	
			System.out.println("문자열 입력 >>");
		
		}
		
		
	}
	
}

