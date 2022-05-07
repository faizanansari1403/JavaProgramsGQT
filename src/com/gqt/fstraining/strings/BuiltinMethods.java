package com.gqt.fstraining.strings;

public class BuiltinMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RajaRamMohanRoy";
		System.out.println(s1.concat("India"));
		System.out.println(s1.getClass());
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		System.out.println(s1.lastIndexOf("R"));
		System.out.println(s1.lastIndexOf("Ra"));
		System.out.println(s1.lastIndexOf('a',6));
		System.out.println(s1.replace("Ram","Sham"));
		System.out.println(s1.replace("a","o"));
		System.out.println(s1.strip());
		System.out.println(s1.trim());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		char[] c=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+",");
		}
		System.out.println(s1.toString());
		System.out.println(s1.toLowerCase().equals("rajarammohanroy"));
	}

}
