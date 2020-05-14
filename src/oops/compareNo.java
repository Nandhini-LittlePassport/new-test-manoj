package oops;

public class compareNo extends Calculator {

	public static void main(String[] args) {
		compareNo obj=new compareNo();
		int age=obj.ReadoneInput();
		obj.CompareNo(age);

	}
	public void CompareNo(int no) {
		if(no>18) {
			System.out.println("He/she is qualified to regitration");
		}
		else {
			System.out.println("He/she is NOT qualified to regitration");
		}
	}

}
