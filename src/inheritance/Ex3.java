package inheritance;

class Test4{
	int x;
	public Test4(int x) {
		super();
		this.x = x;
	}
	public void print() {
		System.out.println(x);
	}
}
//어떠한 경우에도 Super 클래스의 생성자가 한번 불러져야한다.
class Sample4 extends Test4{ //생성자를 만들지 않으면 기본생성자를 생성하는데 부모클래스의 생성자가 인자가 있는 생성자이므로 오류가 발생한다.
	public Sample4() {
		super(10); // 생성자의 최상위에 존재해야함...
		//this(10); // 최상 위에 존재해야한다. 즉 super나 this 한개만 사용 가능한다. //컴파일 에러 발생
	}
	public Sample4(int x) {
		super(x); // 생성자의 최상위에 존재해야함...
	}
}

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample4 sam = new Sample4();
		System.out.println(sam.x);

	}

}
