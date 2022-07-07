package enc;

import java.util.Scanner;

public class Abc extends Xyz {

	public static void main(String[] args) {

		Scanner ui = new Scanner(System.in);
		Abc abc = new Abc();
		
		int b;
		b = abc.getglobalA();
		System.out.println(b);
		
		System.out.println("Enter value to set to a:");
		int newA = ui.nextInt();
		
		
		abc.setglobalA(newA);
		System.out.println(abc.getglobalA());
		
		
		
		
		

		
	}

}
