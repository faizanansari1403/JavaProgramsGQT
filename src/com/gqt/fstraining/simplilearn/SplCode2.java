package com.gqt.fstraining.simplilearn;
import java.util.Scanner;

public class SplCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		s1=s1.replace('a','1');
		s1=s1.replace('e','2');
		s1=s1.replace('i','3');
		s1=s1.replace('o','4');
		s1=s1.replace('u','5');
		s1=s1.replace('A','1');
		s1=s1.replace('E','2');
		s1=s1.replace('I','3');
		s1=s1.replace('O','4');
		s1=s1.replace('U','5');
		System.out.println(s1);
		
		String s2=sc.nextLine();
		String s3="";
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
			if(c=='a' || c=='A') {
				s3=s3+'1';
			}
			else if(c=='e' || c=='E') {
				s3=s3+'2';
			}
			else if(c=='i' || c=='I') {
				s3=s3+'3';
			}
			else if(c=='o' || c=='O') {
				s3=s3+'4';
			}
			else if(c=='u' || c=='U') {
				s3=s3+'5';
			}
			else {
				s3=s3+s2.charAt(i);
			}
		}
		System.out.println(s3);
		
	}

}
