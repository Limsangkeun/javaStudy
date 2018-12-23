package inheritance;

class Test5{
	static int c;
	static {
		System.out.println("suepr static 초기화 블럭");
		c = 200;
		System.out.println(c);
	}
	
	int x;
	{
		System.out.println("super 초기화 블럭");
		x=10;
	}
	
	public Test5() {
		System.out.println("super 생성자...");
	}
	
	public void print() {
		System.out.println(x);
	}
}

class Sample5 extends Test5{
	static int y; 
	static {
		System.out.println("sub static 초기화 블럭");
		y=100;
		System.out.println(y);
	}
	public Sample5() {
		super(); //아버지가 먼저 메모리 할당이 완료된 후에야 자식이 생성될 수 있으므로 super가 sub의 초기화블럭 보다 우선순위를 갖는다. //하지만 static 블록은 먼저 수행된다.
		System.out.println("sub 생성자...");
	}
	
	public void write() {
		System.out.println(x+":"+y);
	}
	
}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample5 sam = new Sample5();
		sam.write();
	}

}
