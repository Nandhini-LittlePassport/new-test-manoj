
public class constructorExample {
	int temp_val;

	public static void main(String[] args) {
		constructorExample obj = new constructorExample();
		constructorExample obj1=new constructorExample(20);
		System.out.println(obj.temp_val);
		System.out.println(obj1.temp_val);

	}
	public constructorExample() {
		temp_val=10;
	}
	public constructorExample(int a) {
		temp_val=20;
	}

}
