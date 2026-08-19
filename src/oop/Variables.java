package oop;

public class Variables {
	
	static int count=1;
	int value=10;
	
	static {
		count=3;
	}
	
	static int increaseCount() {
		return count++;
	}
	
	 int increaseValue() {
		return value++;
	}
		
public static void main(String[] args) {
	System.out.println("static");
	System.out.println("1 : "+increaseCount());
	System.out.println("2 : "+increaseCount());
	System.out.println("non-static");
	Variables obj1=new Variables();
	System.out.println(obj1.increaseValue());
	System.out.println(obj1.increaseValue());
	System.out.println("non-static");
	Variables obj2=new Variables();
	System.out.println(obj2.increaseValue());
	System.out.println(obj2.increaseValue());
}
}
