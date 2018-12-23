package inheritance;

final class FinalTest{
	
}
/*class Demo3 extends FinalTest{ //컴파일 에러 파이널 클래스는 서브 클래스를 생성할수 없띠~
								 //대표 final 클래스 : String 클래스
}*/
class Demo3{
	public final static double PI = 3.141592;
	//final static 변수의 초기 값을 주는 법 1. 선언과 동시에 2. static 초기화 블록에서 
	public final static int A;
	static {
		A=3;
	}
	//final Field 변수의 초기 값을 주는 법 1.선언과 동시에 2.초기화 블록에서 3. 생성자에서
	public final int a;
	{
		a=3;
	}
	public final int c;
	public Demo3() {
		c=20;
	}
	//final static 전 프로그램에서 한번 메모리 할당 그냥 final 변수는 객체 생성시마다 새로운 값을 가질 수 있다.
	//final 변수는 초기화가 한번만 가능 한번은 꼭해야지
	public void print() {
		final int x;
		x=10;
		System.out.println(x);
	}
	
	public final void write() { //하위클래스에서 재정의 불가.		
	}
}

class Sample43 extends Demo3{
	//public void write() {} //final 메서드는 재정의가 불가능하다.//컴파일 오류
}
public class FinalClassEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo3.PI = 3.15; //컴오류. final 변수는 값 변경 불
		//final 변수는 static으로 많이 사용하고 변수명을 대문자로 준다.
	}

}
