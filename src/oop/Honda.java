package oop;

public class Honda extends Bike{

	@Override
	public void run() {
		System.out.println("run");
		
	}

	@Override
	public void run1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
		//obj.changeGear();
		}

}
