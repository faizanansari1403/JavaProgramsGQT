package com.gqt.fstraining.strings;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Ramayana");
		System.out.println(sb.capacity());
		StringBuffer sb1=new StringBuffer("Ramayana");
		System.out.println(sb.compareTo(sb1));
		StringBuffer sb2=new StringBuffer("ramayana");
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
