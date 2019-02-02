package algorithom;

import java.util.Scanner;

public class dynamicFibonacci {
	
    static long dp[]=new long[1000];

	public static long dynamicFib(int n) {
		if(n==0||n==1) {
			return n;
		}else if(dp[n]!=-1) {
			return dp[n];
		}else {
			dp[n]=dynamicFib(n-1)+dynamicFib(n-2);
			return dp[n];
		}
	}
		
	public static void main(String[] args) {
	     for (int i = 0; i <dp.length; i++) {
			dp[i]=-1;
		}
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter Your Elecment:");
	    int n=sc.nextInt();
	    long r= dynamicFib(n);
	    System.out.println(r);
	    
	}

}
