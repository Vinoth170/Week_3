package lab;

public class AbstractDemo {
	public static void main(String[] args) {
		Parent pooja=new Child1();
		pooja.skinTone();
		pooja.height();
		pooja.gender();
		pooja.hobby();
	}
}

abstract class Grandparent{
	public abstract void gender();//abstract method need not to be implemented in abstract child classes
	public final void skinTone() {//final method cannot be overriden by child or grandchild classes
		System.out.println("Shiny skin tone...");
	}
}

abstract class Parent extends Grandparent{
	public abstract void hobby();//This method should be implemented in child classes
	public final void height(){//This method cannot be overriden by child classes
		System.out.println("Height is 6ft...");
	}
}

class Child1 extends Parent{
	public void gender() {
		System.out.println("Female child...");
	}
	
	public void hobby() {
		System.out.println("Hobby is reading...");
	}
}