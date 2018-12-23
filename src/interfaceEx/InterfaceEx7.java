package interfaceEx;

import java.text.NumberFormat;
import java.text.ParseException;

interface Ex7{
	public void print();
	
}

class Test7 implements Ex7{
	public void method() { //임시로 다른 클래스 인터페이스의 함수나 변수를 이용하고 싶을때 //즉 클래스는 필요한데 굳이 저장할 필요는 없을경우
		//익명 클래스를 사용하여 잠시 해결한다. anonymous class
		//익명클래스
		Ex7 ob = new Ex7() { //클래스명 : Test7$1.class $앞 : 외부클래스 $뒤 내부클래스 이름을 주지않앗기때문에 숫자로 지정한다.	
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("출력...");
			}
		};
		ob.print();
		
		//방법 2
		/*new Ex7() { 			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("출력...");
			}
		}.print();;
		*/
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Sangkeun");
	}
}
public class InterfaceEx7 implements Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1,23.4/6,57,89";
		NumberFormat nf = NumberFormat.getInstance();
		try {
			Number a = nf.parse(s);
			System.out.println(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Test7 t = new Test7();
		t.method();
		t.print();
		Ex7 ex = t;
		ex.print();
	}

}
