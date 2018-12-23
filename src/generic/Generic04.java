package generic;

class Test4<T, U> {
	private T t;
	private U u;

	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}
	
	public void print() {
		System.out.println(t.getClass().getName().substring(10)+":"+t);
		System.out.println(u.getClass().getName().substring(10)+":"+u);
	}
}

public class Generic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4<String,Integer> test = new Test4<>();
		test.set("sangkeun", 1000);
		test.print();
	}

	

}
