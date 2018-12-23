package work;
//초기화 할수 있는 방법
//1. 변수에서 선언과 동시에 초기화
//2. 초기화 블럭에서 사용(거의 사용 안함. 그냥 생성자에서 초기화해라)
//2.1 static 초기화 블럭은 쓰인다. 
//3. 생성자에서 초기화
class Ex1{
	private int a;
	private int b=10;
	//n=10; //컴파일 오류. 실행문이 올수 없다.
	
	public static int x=5;
	public static int y;
	
	//초기화 블럭
	{
		System.out.println("초기화 블럭(생성자보다 먼저 실행). 객체가 생성될때마다 실행");
		a=10;
	}
	//static 초기화 블럭
	static {
		System.out.println("static 초기화 블럭. 클래스가 로딩될때 한번만 실행");
		y=6;
	}
	
	public Ex1() {
		System.out.println("생성자...");
	}
	public void print() {
		System.out.println(a+":"+b);
	}
	
	public static void write() {
		System.out.println(x+":"+y);
	}
}

public class Initialized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ex1 e; //static 초기화 블럭도 실행되지 않는다. 클래스가 로딩되는 시점은 클래스가 사용될때이다.
		//
		//Ex1.write(); //클래스가 사용되는 시점이므로 static 블럭이 실행된다.
		
		Ex1 e1 = new Ex1(); //클래스의 최초 사용시 static 초기화 블럭이 실행된다.
		//1. static 초기화 블럭 실행
		//2. 초기화 블럭 실행
		//3. 생성자 몸체를 실행
		Ex1 e2 = new Ex1();
		//1. 초기화 블럭 실행(static 초기화 블럭은 이미 실행되었다.)
		//2. 생성자 몸체를 실행
		e1.print();
		e2.print();
		int x=0, y=10;
		System.out.println();
	}

}
