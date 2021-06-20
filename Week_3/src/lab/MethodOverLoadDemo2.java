package lab;

public class MethodOverLoadDemo2 {
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.mult(53,23);
		obj.mult(23, 4,3);
	}
}

class Demo{
	void mult(int a, int b) {
		System.out.println("Result is "+a*b);
	}
	void mult(int a, int b, int c) {
		System.out.println("Result is "+a*b*c);
	}
}
