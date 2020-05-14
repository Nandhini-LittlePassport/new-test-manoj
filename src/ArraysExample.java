
public class ArraysExample {

	public static void main(String[] args) {
		int[] empid = new int[6];
		empid[0] = 2;
		empid[1] = 3;
		empid[2] = 5;
		empid[3] = 6;
		empid[4] = 8;

		for (int i = 0; i < empid.length; i++) {
			System.out.println("i : " + i + " " + empid[i]);
		}

	}

}
