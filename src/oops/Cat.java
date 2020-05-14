package oops;

public class Cat extends Animals {

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.eating();
		obj.sleeping();
		obj.makingSound();

	}
public void makingSound() {
	System.out.println("Meowwww");
}
}
