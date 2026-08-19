package oop;
public class MethodAndParam {
	public static void main(String[] agrs) {
		System.out.println(methodA("David"));
		System.out.println(MethodAndParam.methodA("James"));
		
		MethodAndParam obj = new MethodAndParam();
		
		System.out.println(obj.methodB("David"));
	}

	public static String methodA(String s) {
		return "Hello " + s;
	}
	
	public String methodB(String s) {
		return "Hello " + s;
	}
}
