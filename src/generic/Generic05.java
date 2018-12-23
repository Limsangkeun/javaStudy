package generic;
//this is Generic method;
//OverLoading을 편하게 하는 느낌
class Test5{
	public <U> U print(U u) {
		System.out.println(u.getClass().getName().substring(10)+":"+u);
		return u;
	}
}

public class Generic05 {

	public static void main(String[] args) {
		Test5 test = new Test5();
		String s = test.print("sangkeun");
		Integer s2 = test.print(50);
		System.out.println();
		System.out.println(s+":"+s2);
		System.out.println(s.length());
	}

	

}
