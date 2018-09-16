
public class TestStatic2 {
	static int a = 100;
	public static void main(String[] args) {
		TestStatic2 v = new TestStatic2();
		System.out.println(v.a);
		
		v.a = 200;
		TestStatic2 v1 = new TestStatic2();
		System.out.println(v1.a);
		
		System.out.println(v.a);
		
		

	}

}
