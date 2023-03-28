package com.Tap.OOPs;


class Constructor{
	
	private int id;
	private String name;
	private long pno;
	
	public Constructor(int id, String name, long pno) {
		this.id=id;
		this.name=name;
		this.pno=pno;
	}
	public int getid(){
		return id;
	}
	public String getname() {
		return name;
	}
	public long getpno() {
		return pno;
	}

	
}

public class GettersSetters {

	public static void main(String[] args) {
		
		Constructor con = new Constructor(123, "Arul", 973816922L);
		System.out.println(con.getid());
		System.out.println(con.getname());
		System.out.println(con.getpno());
		
	}
	
}
