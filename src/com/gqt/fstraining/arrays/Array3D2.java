/**
 * Description:This is the code for demonstration of 3-dimensional array...
 * Requirement:To store marks of n students from m classrooms and o colleges...
 * College:  0           1			2				-->m
 * Class: 0		1	0	1	2	0	1	2	3			-->n
 * Student:1	2	3	4	2	2	2	1			-->o
 * 
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class Array3D2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of college:");
		int m=sc.nextInt();
		System.out.println("Enter the count of the classes in each college:");
		int n=sc.nextInt();
		System.out.println("Enter the count of the students in each classes of each college:");
		int o=sc.nextInt();

	}

}
