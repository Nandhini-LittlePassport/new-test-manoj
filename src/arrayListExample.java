import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> empid=new ArrayList<Integer>();
		empid.add(1);
		empid.add(10001);
		empid.add(9000001);
		System.out.println("Size of teh arraylist : "+empid.size());
		System.out.println(empid.get(0));
		System.out.println(empid.get(1));
		System.out.println(empid.get(2));
		for (int i = 0; i < empid.size(); i++) {
			System.out.println("i : " + i + " " + empid.get(i));
		}

	}

}
