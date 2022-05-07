package com.gqt.fstraining.strings;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Ramayana");
		System.out.println(sb.capacity());
		StringBuilder sb1=new StringBuilder("Ramayana");
		System.out.println(sb.compareTo(sb1));
		StringBuilder sb2=new StringBuilder("ramayana");
		System.out.println(sb.compareTo(sb2));
		sb.delete(5,7);
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
		sb.ensureCapacity(80);
		System.out.println(sb.capacity());
		System.out.println(sb.equals(sb1));
		System.out.println(sb.equals(sb));
	}
}


