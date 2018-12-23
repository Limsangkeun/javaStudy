package classStudy;

class Ex8{
	static int a=10; //클래스가 메모리에 올라오면 static은 자동으로 메모리 할당.
	int b=20; //Test에서 접근 불가 //New 키워드를 사용하지 않으면 메모리 할당이 되지 않는다.
	
	//클래스파일명 : 외부클래스명$내부클래스명.class =>Ex8$Test.class
	public static class Test{ //static 중첩 클래스 : 외부 클래스 객체를 생성하지 않고 
							  //외부에서 객체를 생성하여 사용할 수 있다.
		int c = 30;
		public void write() {
			//System.out.println(b); //외부클래스의 인스턴스 변수나 인스턴스 메소드 접근 불가 //메모리 할당이 되어있지 않으므로
			System.out.println(a+":"+c); //static은 이미 메모리 할당이 되어있으므로 사용가능.
			Ex8 e = new Ex8();
			System.out.println(a+":"+e.b+":"+c);
		}
	}
	
	public void print() {
		//외부에서 내부 클래스의 메서드나 변수를 사용하려면 객체를 생성해야한다.
		Test t = new Test();
		System.out.println(t.c);	
	}
}

public class NestedClassEx {
	public static void main(String[] args) {
		Ex8.Test t = new Ex8.Test();
		t.write();
		//Test tt = new Test(); //컴오류
		//static 중첩 클래스는 외부 클래스의 객체 생성과 상관없이 단독으로 객체를 생성한다.
		Ex8 ee = new Ex8();
		ee.print();
		//Ex8.Test tt2 = ee.new Test(); //컴오류.
		
	}
}
