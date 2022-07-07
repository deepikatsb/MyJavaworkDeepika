package javaSessionSevenOverrideSuper;

public class AA {

	
	public void Printhello() {
		System.out.println("Hello from AA class");
		AA objx = new AA();
		objx.Printhello(); // This calls method of Class XX, how?
		
		//objx.newmethod(); // correct? how to call methods of subclass inside superclass?
		//objx.Printhello1(); // correct?
	}
	
	public void Printhello2() {
		System.out.println("Hello2 from AA class");
		Printhello();
	}

}
