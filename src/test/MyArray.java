package test;

import java.util.Scanner;

public class MyArray {
	
	public static void pr(int[] a) {
		for(int k:a) {
			System.out.println(k+" ");
		}
	}

	public static int big(int[] a) {
		int max=a[0];
		for(int i=0; i<5;i++) {
			if(a[i] >max) {
				max=a[i];
			}
		}
		return max;
	}

	public static void read(int [] a) {
		Scanner scanner; //scanner는 레퍼런스 변수 
		scanner= new Scanner(System.in);
	
		
		System.out.println("정수 5개를 입력하세요 ");
		for(int i=0; i<5; i++) {
			a[i]=scanner.nextInt();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray []; // 배열에 대한 레퍼런스 변수 
		intArray =new int [5];
		read(intArray);
		pr(intArray);
		int max=big(intArray);
		System.out.println(max);
		
		//delete [] intArray; delete 라는 연산자가 없다. 왜냐하면 JVM에 가비지 컬랙션이 있기 때문이다.
		
		//scanner.close();
		
		
	}

}
