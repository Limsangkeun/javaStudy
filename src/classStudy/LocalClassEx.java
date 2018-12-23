package classStudy;
//Local class는 레알 잘 안씀
class Ex10{
	static int a=10;
	int b=20;
	public void write() { //Test클래스는 외부에서 때려 죽어도 객체 생성이 불가능하다. 오직 메서드 안에서만 가능
		int c = 30, e=100; //내부클래스에서 지역변수를 사용시 해당 변수는 final이 된다.
		final int d =40;
		
		class Test{
			public void print() {
				System.out.println(a+":"+b+":"+d);
				System.out.println(c); //7.0은 오류 8.0은 가능
			}
		}
		
		e=50;
		//c=100; //하면 오류 생김. final로 변경되므로 값 변경할 수가 없다.
		Test t = new Test();
		t.print();
	}
}

public class LocalClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex10 e = new Ex10();
		e.write(); //더 이상 접근할 수 있는 방법이 없다.
	}

}
