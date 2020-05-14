package oops;

public class throwsKeywordExample {

	public static void main(String[] args) {
		throwsKeywordExample obj=new throwsKeywordExample();
		try {
			obj.exceptionmethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void exceptionmethod() throws Exception {
		
			throw new Exception();
		
	}
}
