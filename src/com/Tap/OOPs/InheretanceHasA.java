package com.Tap.OOPs;

class Charger{
	
	private String name;
	private int cost;
	
	public Charger(String name, int cost) {
		super();
		this.name=name;
		this.cost=cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	
}

class Os{
	
	private String name;
	private int capacity;
	public Os(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public int getCapacity() {
		return capacity;
	}
		
}

class Phone{
	
 Os o = new Os("Andriod",550);
 
 void hasA(Charger c) {
	 System.out.println(c.getName());
	 System.out.println(c.getCost());
 }
	
}

public class InheretanceHasA {
	
	public static void main(String[] args) {
		
		Phone p = new Phone();
		Charger c = new Charger("Vivo",570);
		System.out.println(p.o.getName());
		System.out.println(p.o.getCapacity());
		
		p.hasA(c);
		
		p=null;
		
		//System.out.println(p.o.getName());
		//System.out.println(p.o.getCapacity());
		
		//p.hasA(c);
		
		System.out.println(c.getName());
		System.out.println(c.getCost());
			
	}

}
