package com.Tap.Strings;

public class Mutablestrings {

	public static void main(String[] args) {
		
		StringBuffer st = new StringBuffer();
		System.out.println(st.capacity());
		st.append("Java");
		System.out.println(st);
		st.append(" JavaScript");
		System.out.println(st);
		st.append("James Gosling");
		System.out.println(st);
		System.out.println(st.capacity());
		st.trimToSize();
		System.out.println(st.capacity());
		System.out.println(st.length());
	}

}
