package com.Tap.OOPs;

import java.util.Scanner;

abstract class Geogementry{
	float area;
	abstract void acceptInput();
	abstract void calcInput();
	void dispArea() {
		System.out.println(area);
	}
}

class Square extends Geogementry{
	private float length;
	Scanner scan=new Scanner(System.in);
	public void acceptInput() {
		System.out.println("Enter the length of the side");
		length = scan.nextFloat();
	}
	public void calcInput() {
	area=length*length;
	}
	
}
class Rectangle extends Geogementry{
	private float length;
	private float breadth;
	Scanner scan=new Scanner(System.in);
	void acceptInput() {
		System.out.println("Enter the length and breadth of the rectangle");
		length = scan.nextFloat();
		breadth = scan.nextFloat();
	}
	void calcInput() {
		area=length*breadth;
	}
	
}
class Circle extends Geogementry{
	private float radious;
	Scanner scan=new Scanner(System.in);
	void acceptInput() {
		System.out.println("Enter the length and breadth of the rectangle");
		radious = scan.nextFloat();
	}
	void calcInput() {
		area=(float) (3.141*radious*radious);
	}
	
}
class Shapes{
	void permit(Geogementry ref) {
		ref.acceptInput();
		ref.calcInput();
		ref.dispArea();
	}
}
public class AbstractEx1 {
	public static void main(String[] args) {
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Shapes sh=new Shapes();
		
		sh.permit(s);
		sh.permit(r);
		sh.permit(c);

	}
}
