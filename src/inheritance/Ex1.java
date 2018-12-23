package inheritance;

class Test2{
	private int a=10; //자식 클래스에서 private 변수를 접근하려면 GET 메서드를 생성해주는 방법 밖에 없다.
	int b=20;
	public int c =3;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
	
	public static void sub() {
		System.out.println("Static 메소드...");
	}
	
}
//Test2 : Sample2의 super class
//Sample2 : Test2의 sub class
class Sample2 extends Test2{
	int c=40;
	int d=50;
	
	public void print() {
		//System.out.println(a);//컴파일 오류 //private이므로
		System.out.println(b); //super의 b를 사용
		System.out.println(this.b); //아버지껀 내꺼이므로 this를 붙여서 호출도 가능하다.
		System.out.println(c); //자신의 변수가 부모의 변수보다 우선순위가 높다.
		System.out.println(super.c); //슈퍼클래스의 필드 접근 
		write();
	}
	
}
public class Ex1 {

	public static void main(String[] args) {
		Object ob = new Sample2();
		Test2 t = (Test2)ob;
		System.out.println();
	}

}
