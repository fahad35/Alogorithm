package algorithom;

import java.util.Scanner;

public class greedyCoinChange {
	 public static void coinChange(int coin[] ,int amount) {
		int no_of_coin=0;
		for(int i=0;i<coin.length;i++) {
			if(amount/coin[i]!=0) {
				no_of_coin += amount/coin[i];
				//System.out.println(coin[i] +" used in "+amount/coin[i]+" time");
			}
			amount=amount%coin[i];
		}
		System.out.println("Total "+no_of_coin+" coin need!");
	}
	 
	 public static void usedCoin(int coin[] ,int amount) {
			int no_of_coin=0;
			for(int i=0;i<coin.length;i++) {
				if(amount/coin[i]!=0) {
					no_of_coin += amount/coin[i];
					System.out.println(coin[i] +" used in "+amount/coin[i]+" time");
				}
				amount=amount%coin[i];
			}
		}


	 public static void main(String [] args) {
		 int coin[] = {20,10,5,2,1};
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter your amount :");
		 int n=sc.nextInt();
		 coinChange(coin, n);
		 usedCoin(coin, n);
	 }
}
