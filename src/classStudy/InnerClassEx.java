package classStudy;

class Ex9 {
	static int a = 10;
	int b = 20;

	// 내부 클래스(member class)
	// 외부에서 static 중첩클래스처럼 단독으로 객체 생성이 불가능하다.
	// 외부클래스의 객체를 먼저 생성하고 생성된 객체를 이용하여 객체 생성이 가능하다.
	// 밖에서 사용하기 위한 목적이 아님 //외부에서 접근하지 못하므로 보안에 유리(private)의 경우
	// 내부 클래스는 모든 접근제어자가 가능하다. 외부는 안붙이거나 public만 가능
	public class Test { // 클래스가 필요한데 밖에 있는 경우 private 변수에 접근하기 어려우므로 내부에 작성하여 사용
		int c = 30;
		public void write() {
			System.out.println(a + ":" + b + ":" + c);
			// 왜 b를 사용할 수 있는가? Test 객체 생성을 위해선 Ex9 객체를 생성해야하기 때문에
		}
	}

	private class Test2 { // 클래스가 필요한데 밖에 있는 경우 private 변수에 접근하기 어려우므로 내부에 작성하여 사용
		int c = 30;
		public void write() {
			System.out.println(a + ":" + b + ":" + c);
			// 왜 b를 사용할 수 있는가? Test 객체 생성을 위해선 Ex9 객체를 생성해야하기 때문에
		}
	}

	public void method() {
		Test ob = new Test();
		System.out.println(ob.c);
	}
}

public class InnerClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex9 ee = new Ex9();
		ee.new Test().write();

		// ee.new Test2().write();//private이므로 외부에서 생성이 불가능하다 컴파일 오류

		// Ex9.Test ee = new Ex9.Test(); //컴오류 외부객체가 우선 생성되어야 내부 접근이 생성이 가능하다.
		// 컴오류 단독 객체 생 성 불 가ㅋ
		// Test t = new Ex9().new Test(); //이런식으로 생성할수 없다.
		Ex9.Test t = new Ex9().new Test(); // 이것도 잘안쓰는 방식 Test클래스 자체를 외부에서 잘 안쓴다.
		t.write();
	}

}
