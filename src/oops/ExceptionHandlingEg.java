package oops;

public class ExceptionHandlingEg {

	public static void main(String[] args) {
		int i = 10;
		try {
			int result = i / 0;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			int result = i / 10;
			System.out.println(result);

		} finally {
			System.out.println("Hi finally");
		}
		System.out.println("hello world");
		ExceptionHandlingEg obj = new ExceptionHandlingEg();
		try {
			obj.add();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void add() throws Exception {
		int i = 10;
		int result = i / 0;

	}
}
