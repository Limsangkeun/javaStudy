package inheritance;

class Test7{
	int a=10;
	int b=20;
	
	public void write() {
		System.out.println(a+":"+b);
	}
	
	public void disp() {
		System.out.println("결과 : "+a+","+b);
	}
}

class Sample7 extends Test7{
	int b=100;
	int c=200;
	@Override
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
	
	public void method() {
		super.write();
		System.out.println(super.b);
	}
}
public class Overriding_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample7 ob = new Sample7();
		Test7 tt = new Test7();
		System.out.println(ob.a); //10
		
		Test7 ts =ob; //up casting. 언제나 가능. casting 하지 않아도 됨 //자식이 만들어지면 아버지는 자동으로 만들어진다. 그래서 가능 
		System.out.println();
		tt.write();
		
		//Sample7 st = tt;//컴파일 에러. down casting.  다운 캐스팅은 업캐시팅 한것만 가능 //다운캐스팅은 명시적으로 캐스팅을 해야함 
		//아버지 객체를 생성함과 동시에 자식 객체를 할당할 수 없다.
		
		System.out.println(ts.b); //20 부모(Test7의 b) //필드는 자기 자신이 우선순위가 높다. 비록 ts가 ob를 나타내고 있지만 ts 자신의 필드가 더 우선순위를 가진다.
		//System.out.println(ts.c); //컴파일 오류 //Test7에 c 변수가 없으므로 할수 없다.
		ts.write(); //자식(Sample7)의 write 함수 호출
					//메소드가 재정의되면 상위클래스의 메소드는 숨어버린다.
					//재정이되면 절대 재정의된 super class의 함수를 사용할 수 없다.
		
		tt.write(); // 자신의 메소드 tt는 Test7의 객체 ts는 Test7의 가면을 쓰고 있는 Sample7 객체
		
		Sample7 s = (Sample7)ts; //Roll back to Sample7 //Down Casting. 업캐스팅 한것만 다운 캐스팅 가능
		System.out.println(s.c);
		//Sample7 s2 = (Sample7)tt; //되는 것처럼 보이지만 런타임 에러 발생
		//s2.write();// 업캐스팅을 하지 않은 것을 다운 캐스팅하였으므로 에러 발생
		
		
		/*
		 * --클래스의 형변환시 주의 사항
		 * 클래스간의 형변환은 상하관계에서만 가능하다.
		 * 업 캐스팅(상위 클래스의 객체가 하위 클래스의 객체를 가르키는 것)은 언제나 가능하다.
		 * 다운 캐스팅(상위 클래스의 객체를 하위 클래스의 객체로 변환하는 것)은 업 캐스팅한 것만 가능하고 반드시 명시적으로 캐스팅을 해야 한다.
		 */
		
	}

}
