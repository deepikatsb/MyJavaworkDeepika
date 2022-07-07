package javaSessionSevenOverrideSuper;

public class XX extends AA {

	public static void main(String[] args) {

		
		XX objx1 = new XX();
		objx1.newmethod();	
		//objx1.Printhello1();
	
	}
	 public void newmethod() {
		XX objx = new XX();
		super.Printhello();
		objx.Printhello();	
	}
	public void Printhello() {
		System.out.println("Hello from XX class");
	}
	
	public void Printhello1() {
		System.out.println("Hello1 from XX class");
		
	}

}
