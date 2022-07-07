package enc;

public class Xyz {

	private int globalA = 50;
	
	private void xyzMethod() {
		System.out.println("Inside Private xyzMethod");
	}
	
	public int getglobalA() {
		
		return this.globalA;
	}
	
	public void setglobalA(int a) {
		this.globalA = a;
	}
}
