package com.Tap.Strings;

public class BasedOnValues {

	public static void main(String[] args) {
		
		String s1=new String("Java");
		String s2 = "Java";
		
		if(s1==s2)
		{
			System.out.println("Same Reference");
		}
		else
		{
			System.out.println("Different Reference");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Equal based on values");
		}
		else
		{
			System.out.println("Not equal values");
		}

	}

}
