
public class methodOverloadingexample {
	public static void main(String[] args) {
		methodOverloadingexample obj=new methodOverloadingexample();
		obj.addition();
		obj.addition(1, 2.5);
		obj.addition(2, 3);
		obj.addition(1, 19, 29);
	}
	public void addition() {
		System.out.println("without any arguments");
	}
	public void addition(int a,int b) {
		int c=a+b;
		System.out.println("addition of 2 nos : "+c);
	}
	
	public void addition(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("addition of 3 nos : "+d);
		
	}
	public void addition(int a,double b) {
		double c=a+b;
		System.out.println("addition of int and decimal : "+c);
	}

}
