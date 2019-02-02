package algorithom;

import java.util.Scanner;

public class mergeSort {

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
	
	public static void merge(int a[],int p,int q,int r) {
		int n1=q-p+1;
		int n2=r-q;
		int L[]=new int [n1+1];
		int R[]=new int [n2+1];
		for(int i=0;i<n1;i++) {
			L[i]=a[p+i];
		}
		L[L.length-1]= Integer.MAX_VALUE;
		for(int i=0;i<n2;i++) {
			R[i]=a[q+1+i];
		}
		R[R.length-1]= Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k=p;k<=r;k++) {
			if(L[i]<R[j]) {
				a[k]=L[i];
				i++;
			}
			else {
				a[k]=R[j];
				j++;
			}
		}
		
	}
	
	public static void mergeS(int a[],int p,int r) {
		if(p<r) {
			int q=(p+r)/2;
			mergeS(a,p,q);
			mergeS(a,q+1,r);
			merge(a,p,q,r);
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
	   mergeS(a, 0, n-1);
	   System.out.println("Sorted array is:");
	   printArray(a);
	}

}
