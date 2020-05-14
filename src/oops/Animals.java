package oops;

public class Animals {
	String animal_name;
	String animal_color;
	

	public static void main(String[] args) {
		Animals obj=new Animals();
		obj.eating();
		obj.sleeping();

	}
	public void eating() {
		System.out.println("Animal is Eating");
	}
	public void sleeping() {
		System.out.println("Animal is Sleeping");
	}

}
