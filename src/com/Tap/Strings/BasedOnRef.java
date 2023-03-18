package com.Tap.Strings;

public class BasedOnRef {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 =new String( "Java");
		
		System.out.println(s1 == s2);
		
		if(s1 == s2)
		{
			System.out.println("Java");
		}
		else
		{
			System.out.println("Not equal");
		}

	}

}
