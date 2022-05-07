package com.gqt.fstraining.simplilearn;
import java.util.Scanner;

public class SplCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		int vowel_count=0;
		int cons_count=0;
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowel_count++;
			}
			else {
				cons_count++;
			}
		}
		System.out.println("Length of the string is:"+s1.length());
		System.out.println("Total vowels are:"+vowel_count);
		System.out.println("Total consonants are:"+cons_count);
	}

}
