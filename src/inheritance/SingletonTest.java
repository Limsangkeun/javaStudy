package inheritance;

class Singleton2{
	public int a = 10;
	private Singleton2() {
		
	}
	public static Singleton2 getInstance() {
		return Ton.INSTANCE;
	}
	public static class Ton{
		private static final Singleton2 INSTANCE = new Singleton2(); 
	}
	
}
public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton2 one = Singleton2.getInstance();
		Singleton2 two = Singleton2.getInstance();
		one.a = 100;
		System.out.println(two.a);
	}

}
