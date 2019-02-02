package algorithom;

import java.util.Scanner;

public class binarySearch {

	public static int binarySearchMethod(int a[],int item) {
		int left=0;
		int right=a.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(a[mid]==item) {
				return mid;
			}
			else if(a[mid]>item) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	   int a[]= {1,2,3,4,5,6,7,8,9};
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter your Search Item:");
	   int n=sc.nextInt();
	   int l=binarySearchMethod(a, n);
	   if(l !=-1) {
		   System.out.println("Item found at "+ l +" index!");
	   }else {
		   System.out.println("Item Not Found!");
	   }
	}

}
