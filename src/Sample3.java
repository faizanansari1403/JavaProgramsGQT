//Condition-3,  j==0;

import java.util.Scanner;
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
