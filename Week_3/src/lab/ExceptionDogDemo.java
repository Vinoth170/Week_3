package lab;

public class ExceptionDogDemo{
	public static void main(String[] args) {
		Dog tiger =new Dog();
		Child krish=new Child();
		Item item=new Stick();
		krish.playWithDog(tiger, item);
	}
}

abstract class DogException extends Exception{
	
}

class DogAngryException extends DogException{
	String msg;
	public DogAngryException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}
}

class DogHappyException extends DogException{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	
}

abstract class Item{
	public abstract void execute()throws DogException;
}

class Stick extends Item{
	public void execute() throws DogAngryException{
		throw new DogAngryException("You beat I bite......!");
	}
}

class Biscuit extends Item{
	public void execute() throws DogHappyException{
		throw new DogHappyException("I love biscuits.....!");
	}
}

class Dog{
	public void play(Item item) throws DogException{
		item.execute();
	}
}

class Child{
	public void playWithDog(Dog tiger,Item item) {
		try {
			tiger.play(item);
		}
		catch(DogException dex) {
			System.out.println(dex);
		}
	}
}