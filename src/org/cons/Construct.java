package org.cons;

public class Construct extends Parent {
	
	public Construct() {
		this(2372,54735l);
		System.out.println("Name is anu");
	}
	
	public Construct(int id,long l) {
		this("Banu",3474.347724f);
		System.out.println(id);
		System.out.println(l);
	}
	
	public Construct(String s, float f){
		super("Gayathri");
		System.out.println(f);
		System.out.println(s);
	}
	

	public static void main(String[] args) {
		Construct c=new Construct();
		Parent p=new Parent(2764676);
		Parent pq=new Parent();
		
	}
}
