package algorithom;

import java.util.Scanner;

public class longestCommonSubsequence {

	public static void printArray(int a[][],int row,int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void longestCommonSubsequenceMethod(String s1, String s2){
		int row=s1.length()+1;
		int col=s2.length()+1;
		int table[][]=new int[row][col];
	    for (int i = 0; i < row; i++) {
				table[i][0]=0;
		}
	    for (int i = 0; i < col; i++) {
			table[0][i]=0;
		}
	    for (int i = 1; i <row; i++) {
			for (int j = 1; j <col; j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					table[i][j]=table[i-1][j-1]+1;
				}else {
					table[i][j]=Math.max(table[i-1][j], table[i][j-1]);
				}
			}
		}
	    
	    printArray(table, row, col);
	    int length=table[row-1][col-1];
	    System.out.println("The length of longest Common Subsequence is :"+length);
	    trace(row-1, col-1, table[row-1][col-1], table, s1, s2);
	}
	
	public static void trace(int i,int j,int length,int table[][],String s1,String s2) {
		char s[]=new char[length];
		while(i>0 && j>0) {
			if(table[i][j]==table[i-1][j-1]+1 && s1.charAt(i-1)==s2.charAt(j-1)) {
				s[--length]=s1.charAt(i-1);
				i -= 1;
				j -= 1;
			}else if(table[i][j]==table[i-1][j]) {
				i -= 1;
			}else {
				j -= 1;
			}
		}
		
		for (int k = 0; k < s.length; k++) {
			System.out.print(s[k]);
			if(k==s.length-1) {
				System.out.println();
			}else {
				System.out.print(" ");
			}
		}
	}
	
	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String s1,s2;
       System.out.println("Enter your Frist String: ");
       s1=sc.nextLine();
       System.out.println("Enter your Second String: ");
       s2=sc.nextLine();
       longestCommonSubsequenceMethod(s1, s2);
	}

}
