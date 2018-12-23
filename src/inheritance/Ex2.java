package inheritance;
class Test3{
	int a=10;
	int b=20;
	
	public Test3() {//생성자를 만들지 않은 경우에만 public Test3(){} 처럼 컴파일러가 디폴트 생성자를 만들어줌
		System.out.println("super 클래스의 생성자...");
	}
	
	public void write() {
		System.out.println(a+":"+b);
	}
	
}
class Sample3 extends Test3{
	int b=100;
	int c =200;
	public Sample3() {
		super(); //생성자를 만들지 않거나 입력하지 않은 경우에도 자동으로 삽입된다. 부모의 생성자 호출
		System.out.println("sub class 생성자....");
	}
	public void print() {
		System.out.println();
		System.out.println(a+":"+super.b+":"+b+":"+c);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 ob = new Sample3();
		
	}

}
