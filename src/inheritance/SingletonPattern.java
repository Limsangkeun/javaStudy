package inheritance;

class Single {
	private static Single ob;
	private int a;

	private Single() {

	}

	public static synchronized Single getInstance() {
		// 동기화 안하면 잘못하면 두개 생성될 수 있다.
		if (ob == null)
			ob = new Single();

		return ob;
	}

	public void print() {
		System.out.println(a);
	}
}
class Single2{
	public Single2() {
		
	}
	public static class Holder{
		public static final Single2 INSTANCE = new Single2();
	}
	public static Single2 getInstance() {
		return Holder.INSTANCE;
	}
}
public class SingletonPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Single e = new Single(); //컴파일 오류. 생성자가 private이면 외부객체 생성불가0
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		if (s1 == s2)
			System.out.println("같은 객체");
	}
}