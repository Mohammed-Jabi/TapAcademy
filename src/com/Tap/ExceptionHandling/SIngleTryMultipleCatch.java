package com.Tap.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SIngleTryMultipleCatch {

public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the Numerator");
			int a = scan.nextInt();
			System.out.println("Enter the Denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
			
			System.out.println("Enter the size of the array");
			int size = scan.nextInt();
			int[] ar = new int[size];
			System.out.println("Enter the element to be stores");
			int ele = scan.nextInt();
			System.out.println("ENter the index");
			int index = scan.nextInt();
			ar[index] = ele;
			System.out.println(ar[index]);
		}
		catch(ArithmeticException ar) {
			System.out.println("Enter a valid denominatoe");
		}
//		catch(IndexOutOfBoundsException iob) {
//			System.out.println("Array index out of bond");
//		}
		catch(NegativeArraySizeException nas) {
			System.out.println("Enter a positive array size ");
		}
		catch(InputMismatchException ime) {
			System.out.println("Give the proper input formate");
		}
		catch(ArrayIndexOutOfBoundsException aio) {
			System.out.println("Array index out of bond");
		}
		catch(Exception e) {
			System.out.println("Some mistaken user input");
		}
	
		System.out.println("Executed sucessfully");
		
	}

}
