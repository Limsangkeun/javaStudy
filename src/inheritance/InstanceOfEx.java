package inheritance;
class Aac{
	int a=10;
	public void print() {
		System.out.println(a);
	}
}

class Demo1 extends Aac{
	int a = 0;
	int b = 20;
	int c = 30;
	static class A{
		
	}
	public void print() {
		System.out.println(a+":"+b+":"+c+":"+super.a);
	}
	public void write() {
		System.out.println(b+":"+c);
	}
}
public class InstanceOfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aac e1 = new Demo1(); //업캐스팅
		Aac e2 = new Aac();
		e1.print(); //Demo1 메소드 호출 //오버라이드 햇으므로
		System.out.println(e1.a); //Ex1의 a
		
		//e1.write();//컴파일러는 e1에 write메서드가 없으므로 부르지 못한다. //컴파일 오류
		((Demo1)e1).write(); //따라서 다운캐스팅 필요;
		//((Demo1)e2).write(); //런타임 에러. 업캐스팅 한것만 다운 캐스팅 가능하므로
		
		System.out.println(e1 instanceof Demo1);
		System.out.println(e2 instanceof Demo1);
		
		//이런식의 코드는 런타임에러를 줄이는 효과가 있다.
		if(e1 instanceof Demo1) {
			Demo1 c1 = (Demo1)e1;
			System.out.println("다운 캐스팅...");
			c1.write();
		}
		if(e2 instanceof Demo1) {
			Demo1 c1 = (Demo1)e2;
			System.out.println("다운 캐스팅2...");
			c1.write();
		}
	}

}
