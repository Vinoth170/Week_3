package lab;

public class AssoDemo {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		laddu.setSize(10);
		
		System.out.println("Size of laddu before a bite: "+laddu.size);
		
		AssoDemo obj=new AssoDemo();
		obj.biteLaddu(laddu);
		
		System.out.println("Size of laddu after bite: "+laddu.size);
	}
	public void biteLaddu(Laddu l) {
		System.out.println("Laddu is eaten now....");
		l.setSize(5);
	}
}

class Laddu{
	int size;
	public void setSize(int s) {
		size=s;
	}
}