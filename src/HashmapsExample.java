import java.util.HashMap;

public class HashmapsExample {

	public static void main(String[] args) {
		
		HashMap<Integer, Double> empdetails=new HashMap<Integer, Double>();
		empdetails.put(001, 100.50);
		empdetails.put(10001, 100000.00);
		System.out.println(empdetails.get(10001));
		
	}

}
