package com.gqt.fstraining.strings;

public class Program8 {
	public static void main(String[] args) {
		String s1=new String("Rama");
		String s2=new String("rama");
		int res=s1.compareTo(s2);
		if(res==0) {
			System.out.println(res);
			System.out.println("Strings are equal");
		}
		else {
			System.out.println(res); //0
			System.out.println("Strings are not equal"); 
		}
	}
}
		
