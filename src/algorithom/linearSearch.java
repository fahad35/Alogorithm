package algorithom;

import java.util.*;;

public class linearSearch {

	public static int  linearSearchMethod(int a[],int item) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]==item) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[]= {20,30,10,5,2,18};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Search Elecment:");
		int n=sc.nextInt();
		int l=linearSearchMethod(a, n);
		if(l!=-1) {
			System.out.println("Item Found at "+l+" index!");
		}else {
			System.out.println("Item not found!");
		}
	}

}
