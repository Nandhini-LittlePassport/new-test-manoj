
public class conditionalstmtEg {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=5;
		
		if(a>b||a==b) {
			if(a==b) {
				System.out.println("a is equal to b");
			}
			if(a>c) {
				System.out.println("a is greates among three no's");
			}
			else if(b>c) {
				System.out.println("b is geatest among three no's");
			}
			else {
				System.out.println("c is greatest");
			}
		}
		else if(b>c) {
			System.out.println("b is geatest among three no's");
		}
		else {
			System.out.println("c is greatest");
		}

	}

}
