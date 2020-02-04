package org.cons;

public class ClassA   {
	public ClassA(){
		this("Java");
		System.out.println("Default const....");
	}
	public ClassA(int id) {
		this(3343.2343f);
		System.out.println(id);
	}
	
	public ClassA(String Name) {
		this(12);
		System.out.println(Name);
	}
	
	public ClassA(float sal) {
		
		System.out.println(sal);
	}
	
	public static void main(String[] args) {
		ClassA a=new ClassA();
		
		
	}
		
	}
	