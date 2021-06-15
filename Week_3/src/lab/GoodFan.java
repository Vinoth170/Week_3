package lab;

import java.util.Scanner;

public class GoodFan {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		PullThread thread=new PullThread();
		SwitchOn on=new SwitchOn();
		MediumSpeed medium=new MediumSpeed();
		HighSpeed high=new HighSpeed();
		SwitchOff off=new SwitchOff();
		PullThread[] obj= {on,medium, high,off};
		while(true) {
			for(PullThread i:obj) {
				scan.next();
				thread.pull=i;
				thread.pullThread();
			}
		}
	}
}

class PullThread{
	PullThread pull;
	public void pullThread() {
		System.out.println(pull);
	}
	
}

class SwitchOn extends PullThread{
	
}

class MediumSpeed extends SwitchOn{
	
}

class HighSpeed extends MediumSpeed{
	
}

class SwitchOff extends HighSpeed{
	
}
