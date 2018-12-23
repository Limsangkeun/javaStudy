package interfaceEx;

//alt + shift + r =>똑같은 이름 전체 Rename;
//alt + shift + s + r => getter,setter 생성
interface Aex3 {
	public void print();
}

interface Bex3 {
	public void write();
}

interface Ex3 extends Aex3, Bex3 { // 인터페이스는 다중상속이 가능 //흔하지 않은 경우
	public void sub();
}

class ExImpl3 implements Ex3 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print....");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write....");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub....");
	}

}

public class InterfaceEx3 {
	public static void main(String[] args) {
		Ex3 ex = new ExImpl3();
		Aex3 ex2 = new ExImpl3();
		Bex3 ex3 = new ExImpl3();
		
		ex.sub();
		ex.print(); //왜 가능한가? super interface 로부터 상속 받았기 때문
		ex.write(); //왜 가능한가? super interface 로부터 상속 받았기 때문
		
		ex2.print();
		ex3.write();
		
	}
}
