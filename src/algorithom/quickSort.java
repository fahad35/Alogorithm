package algorithom;

import java.util.Scanner;

public class quickSort {

	
	public static void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i==a.length-1) {
				System.out.println();
			}
			else {
				System.out.print(" ");
			}
		}
	}
	
	public static  int partition(int a[],int p,int q) {

		int temp=a[q];
		int i=p-1;
		int j=p;
		for(;j<q;j++) {
			if(a[j]<=temp) {
				i +=1;
				int swap=a[j];
				a[j]=a[i];
				a[i]=swap;
			}
		}
		i +=1;
		int swap=a[i];
		a[i]=a[j];
		a[j]=swap;
	   return i;
	}
	
	public static void quick(int a[],int p,int q) {
		if(p<q) {
			int pivot=partition(a, p, q);
			quick(a, p, pivot-1);
			quick(a, pivot+1, q);
		}
	}
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter your Size of array: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	   System.out.println("Your array is:");
	   printArray(a);
	   quick(a, 0, n-1);
	   System.out.println("Sorted array is:");
	   printArray(a);  
	}

}
