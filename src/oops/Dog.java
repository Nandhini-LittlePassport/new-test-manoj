package oops;

public class Dog extends Animals {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eating();
		obj.makingSound();
	}

	public void makingSound() {
		System.out.println("Barking!!!");
	}
}
