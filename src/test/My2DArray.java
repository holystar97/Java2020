package test;

public class My2DArray {

	
	public static void print2d(int n[][]) {

		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int [][] makeArray(){
		int n[][];
		n= new int[3][];
		
		n[0]=new int[3];
		n[1]=new int[7];
		n[2]=new int[10];
		
		return n;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이차원 정수배열을 가리키는 레퍼런스 배열 n 선언 
		int n[][];
		n=makeArray();
		
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				n[i][j]=i*j;
			}
		}
		print2d(n);
	}

}
