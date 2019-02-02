package algorithom;

import java.util.Scanner;

public class dynamicCoinChange {

	public static void printArray(int a[][],int row,int col) {
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void printingCoin(int coin[], int table[][],int amount,int i ,int j) {
		System.out.println("Required Coin are: ");
		while(i>0 && j>0) {
			if(table[i-1][j]==table[i][j]) {
				i--;
				continue;
			}
			System.out.print(coin[i]+ " ");
			j=j-coin[i];
		}
	}
	
	private static void coinChange(int coin[],int amount) {
		int row=coin.length;
		int col=amount+1;
		int table[][]=new int [row][col];
	    for (int i = 0; i < row; i++) {
			table[i][0]=0;
		}
	    for (int i = 0; i < col; i++) {
			table[0][i]=i/coin[0];
		}
	    for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if(coin[i]>j) {
					table[i][j]=table[i-1][j];
				}else {
					table[i][j]=Math.min(table[i-1][j], table[i][j-coin[i]]+1);
				}
			}
		}
	   // printArray(table, row, col);
	    System.out.println("Minimum Elecment is:"+table[row-1][col-1]);
	    printingCoin(coin, table, amount, row-1, col-1);
	}
	
	public static void main(String[] args) {
	int coin[]= {1,5,7,10,20};
	Scanner sc= new  Scanner(System.in);
    System.out.println("Enter your amount:");
    int n=sc.nextInt();
    coinChange(coin, n);
	}
}
