package com.gqt.fstraining.strings;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Ramayana");
		StringBuffer sb1=new StringBuffer("Ramayana");
		System.out.println(sb.compareTo(sb1));
		StringBuffer sb2=new StringBuffer("ramayana");
		System.out.println(sb.capacity());
		//sb.ensureCapacity(80);
		System.out.println(sb.capacity());
		System.out.println(sb.equals(sb1));
		System.out.println(sb.equals(sb));
		System.out.println(sb.getClass());
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.isEmpty());
		System.out.println(sb.lastIndexOf("a"));
		System.out.println(sb.length());
		sb.replace(0, 4, "Sita");
		System.out.println(sb);
		//sb.reverse();
		//System.out.println(sb);
		sb.setCharAt(7, 's');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(10);
		System.out.println(sb.length());
		System.out.println(sb.substring(4));
		sb.append(sb1);
		System.out.println(sb);
	}

}
