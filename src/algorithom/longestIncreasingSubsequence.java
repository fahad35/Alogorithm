package algorithom;

import java.util.Scanner;

public class longestIncreasingSubsequence {

	
	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i==a.length-1) {
				System.out.println();
			}else {
				System.out.print(" ");
			}
		}
	}
	
	public static void  longestIncreasingSubsequencMethod (int a[]) {
		int lis[] =new int[a.length];
		int trace[]= new int[a.length];
		for (int i = 0; i < lis.length; i++) {
			lis[i]=1;
		}
		for (int i = 0; i < trace.length; i++) {
			trace[i]=-1;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j] && lis[i]+1>lis[j]) {
					lis[j]=lis[i]+1;
					trace[j]=i;
				}
			}
		}
		//printArray(lis);
		int max=lis[0];
		int index=0;
		for (int i = 1; i < lis.length; i++) {
			if(lis[i]>max) {
				max=lis[i];
				index=i;
			}
		}
		System.out.println("Length of longest Increasing Subsequenc is: "+max);
		trace(index, a, trace);
		System.out.println(a[index]);
	}
	
	private static void trace(int index,int a[],int trace[]) {
		if(trace[index]!=-1) {
			index=trace[index];
			trace(index,a,trace);
			System.out.print(a[index]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("Enter your size of array:");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter your ELecment of array:");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		longestIncreasingSubsequencMethod(a);
	}

}
