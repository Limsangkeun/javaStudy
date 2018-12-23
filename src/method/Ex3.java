package method;

class Method3{
	//인스턴스 변수
	int x=10; //동일한 패키지에서만 접근 가능
	private int y=20; //클래스 외부에선 접근 불가
	public static int z=30; //클래스 변수
	public void sub1() { //인스턴스 메서드 => 다른 메서드 호출에 문제가 없다.
		sub2();
		sub3();
		System.out.println(x+":"+y+":"+z);
	}
	private void sub2() {
		System.out.println("private 메소드.....");
	}
	
	public static void sub3() { //클래스 메소드
		//System.out.println(x); //컴파일 오류. 인스턴스 변수 접근 불가(메모리 할당해야하므로)
		System.out.println("static 메소드 : "+z);
		
		//인스턴스 변수에 접근하고 싶으면 객체에 생성하고 접근해야한다.
		Method3 o = new Method3();//메모리 할당
		System.out.println(o.x);
	}
}
public class Ex3 {
	int a=10;
	public void write() { //메인 메서드에 거의 함수를 선언 하지 않는다.
		System.out.println("a : "+a);
	}
	public static void main(String[] args) { //프로그램 실행시 클래스 함수 main을 찾는다. static을 빼고 인스턴스 함수화하면 실행 불가
		// TODO Auto-generated method stub
		//System.out.println(a);//인스턴스 변수는 클래스 함수에 사용 될 수 없다.//컴오류.
		Ex3 obj = new Ex3();
		obj.write();
		
		Method3 ee = new Method3();
		System.out.println(Method3.z); //클래스 변수 호출
		Method3.sub3(); //클래스 함수 호출
		ee.sub1();
		//ee.sub2(); //private은 클래스 외부의 접근을 막으므로 호출 불가	
	}
}
