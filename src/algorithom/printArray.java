package algorithom;

import java.util.Scanner;

public class printArray {

	public static void printArrayDiagonally(int a[][]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<j && i+1 ==j ) {
					System.out.println("I="+i+"J="+j);
					System.out.println(a[i][j]+" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int table[][]=new int [5][5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j]=sc.nextInt();
			}
		}
		printArrayDiagonally(table);
	}

}
