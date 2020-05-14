
public class methodExample {

	public static void main(String[] args) {
		methodExample obj = new methodExample();
		methodExample obj1=new methodExample();
		obj.printhello();
		System.out.println("method execution completed");
		String resu = obj.sendmsg();
		System.out.println("result : " + resu);
		obj.add(2, 3);
		System.out.println(obj.sub(5, 3));
		System.out.println(obj1.sub(1, 2));
	}

	public void printhello() {
		System.out.println("Hello");
	}

	public String sendmsg() {
		String msg = "hello world";
		return msg;
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("c : " + c);
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}
}
