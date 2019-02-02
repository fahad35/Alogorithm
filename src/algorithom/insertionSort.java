package algorithom;

import java.util.Scanner;

public class insertionSort {

	  static Scanner sc=new Scanner(System.in);
	    public static void insertion(int ar[], int n){
	        int temp, j;
	        for (int i = 0; i < n; i++) {
	            temp=ar[i];
	            j=i-1;
	            for(;j>=0&&ar[j]>temp;j--) {                
	                ar[j+1]=ar[j];
	            }
	            ar[j+1]=temp;
	        }
	    }
	public static void main(String[] args) {
		
		int n;
        System.out.println("Enter The Number Of Element: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        insertion(arr, n);
        System.out.println("Sorted Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i==n-1) {
            	System.out.println();
            }else {
            	System.out.print(" ");
            }
        }
        System.out.println("Done!");
		
	}

}
