package oops;

import java.util.ArrayList;

public class Addition extends Calculator {

	public static void main(String[] args) {
		Addition obj=new Addition();
		ArrayList<Integer> input_numbers=obj.ReadtwoInput();
		obj.addnos(input_numbers);
	}

	public void addnos(ArrayList<Integer> numbers) {
		int no1=numbers.get(0);
		int no2=numbers.get(1);
		int result=no1+no2;
		System.out.println("Result : "+result);
	}
}
