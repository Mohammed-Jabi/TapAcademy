package com.Tap.programs.strings;

import java.util.Scanner;

public class ComboOfAllTypeString {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		String[] ar = split(s);
		
		//1
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+ " ");
		}
		System.out.println();
		
		//2

		for(int i=0; i<ar.length; i++) {
			System.out.print(reverse(ar[i])+ " ");
		}
		System.out.println();
		
		//3
		
				for(int i=ar.length-1; i>=0; i--) {
					System.out.print(ar[i]+ " ");
				}
				System.out.println();

				//4
				
				for(int i=ar.length-1; i>=0; i--) {
					System.out.print(reverse(ar[i])+ " ");
				}
				System.out.println();
				
				//5
				
				for(int i=0; i<ar.length; i++) {
					System.out.print(ar[i]+ar[i].length()+ " ");
				}
				System.out.println();
				
//6
				
				for(int i=1; i<ar.length; i=i+2) {
					System.out.print(ar[i]+ar[i].length()+ " ");
				}
				System.out.print(ar.length-1);
				System.out.println();
				
				//7
								
				for(int i=0,j=ar.length-1;i<j; i++,j++) {
					System.out.print(ar[i]+ar[i].length()+ " ");
				}
				System.out.print(ar.length-1);
				System.out.println();
				
				//8
				
				for(int i=0,j=ar.length-1;i<j; i++,j--) {
					System.out.print(reverse(ar[i])+ar[i].length()+ " ");
				}
				System.out.println();
		
		
		
		
		
		


	}

	static String[] split(String s) {
		
		int wordCount = countWords(s);
		String []ar = new String[wordCount];
		String t="";
		int j=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch != ' ') {
				t=t+ch;
			}
			else if(t.length()>0){
				ar[j]=t;
				j++;
				t="";
			}
		}
		return ar;
	}
	
	static int countWords(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ' && s.charAt(i) !=' ') {
				count++;
			}
		}
		return count+1;
	}
	
	static String reverse(String t){
		String q="";
		for(int i=t.length()-1; i>=0; i--) {
			q=q+t.charAt(i);
		}
		return q;
	}

}
