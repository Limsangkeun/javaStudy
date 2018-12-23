package method;

class Method9{
	public void sub(int i) { //int, Integer
		System.out.println("int ...");
	}
	public void sub(Short i) { //short, Short //대응 되는 클래스
		System.out.println("Short ...");
	}
	public void sub(Long i) { //long, Long
		System.out.println("Long ...");
	}

}
public class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method9 m = new Method9();
		byte b =10;
		long c =10;
		short d = 10;

		m.sub(b);  // int. 자료형이 크거나 같은 기본자료형 중 가장 가까운 자료형 호출
		m.sub(c);  // Long. 크거나 같은 기본자료형이 없는 경우 기본자료형에 대응되는 클래스
		m.sub(d);
		//1.자기 자료형
		//2.기본 자료형 중에서 가장 가까운 자료형
		//3.
	}

}
