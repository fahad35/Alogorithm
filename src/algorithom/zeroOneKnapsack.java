package algorithom;

import java.util.Scanner;

public class zeroOneKnapsack {

	public static void printingArray(int a[][],int row,int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void zeroOneKnapsackMethod(int weight[],int value[],int knapsack) {
		int col=knapsack+1;
		int row=value.length+1;
		int table[][] =new int[row][col];
		for (int i = 0; i < row; i++) {
			table[i][0]=0;
		}
		for (int i = 0; i < col; i++) {
			table[0][i]=0;
		}
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if(weight[i-1]>j) {
					table[i][j]=table[i-1][j];
				}else {
					table[i][j]=Math.max(table[i-1][j-weight[i-1]]+value[i-1], table[i-1][j]);
				}
			}
		}
		printingArray(table, row, col);
		int length=table[row-1][col-1];
		System.out.println("Total profit is :"+length);
	}
	
	
	public static void main(String[] args) {
		int weight[]= {2,1,6,5,4};
		int value[]= {5,3,12,20,16};
		Scanner sc = new Scanner(System.in);
		int k;
		System.out.println("Enter your Knapsack Size :");
		k=sc.nextInt();
		zeroOneKnapsackMethod(weight, value, k);
	}

}
