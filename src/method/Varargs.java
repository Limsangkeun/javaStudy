package method;

public class Varargs {

	public int sum(int... a) {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varargs v = new Varargs();
		int s;
		s = v.sum(1, 2, 3, 4, 5);
		System.out.format("%d", s);
	}
}
