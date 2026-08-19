package oop;

public interface Printable {
	
	public static final int number =10;
	//String value;
	
	public void print();
	void print1();
	default void print2() {
		
	}
	private void print3() {
		
	}
}
