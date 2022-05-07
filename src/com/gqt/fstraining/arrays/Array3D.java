/**
 * Description:This is the code for demonstration of 3-dimensional array...
 * Requirement:
 * Class:
 * Student:
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class Array3D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of college:");
		int m=sc.nextInt();
		System.out.println("Enter the count of the classes in each college:");
		int n=sc.nextInt();
		System.out.println("Enter the count of the students in each classes of each college:");
		int o=sc.nextInt();
		
		int arr[][][]=new int[m][n][o];
		
		//code for collecting marks..
		for(int i=0;i<arr.length;i++) { //-->college
			System.out.println("Inside the college: "+i);
			for(int j=0;j<arr[i].length;j++) { //-->class
				System.out.println("Inside the class: "+j);
				for(int k=0;k<arr[i][j].length;k++) { //-->students
					System.out.println("The marks for student : "+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		//code for printing marks..
		for(int i=0;i<arr.length;i++) { //-->college
			System.out.println("Inside the college: "+i);
			for(int j=0;j<arr[i].length;j++) { //-->class
				System.out.println("Inside the class: "+j);
				for(int k=0;k<arr[i][j].length;k++) { //-->students
					System.out.println("The student- "+(k+1)+" marks is : "+arr[i][j][k]);
				}
			}
		}
	}
}