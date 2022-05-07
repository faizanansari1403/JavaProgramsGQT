package com.gqt.fstraining.strings;

public class ImmutableDisAd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Ravana";
		s1.concat("Sita");
		System.out.println(s1);//RavanaSita
/*Since we are making use of String class 
which belongs to immutable strings
we cannot directly make changes to immutable strings.*/
		
/*If we have to make changes to the immutable strings
 then we have to forcefully add the assignment on the LHS.
 */
		s1=s1.concat("Sita");
		System.out.println(s1);
	}

}
