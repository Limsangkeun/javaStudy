class Aclass{
    public int x=10;
    public void write() {}
    public void print() {}
}

class Bclass extends Aclass {
    public int x=100;
    public void print() {System.out.println("B.print");}
    public void sub() {}
}
public class Something {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bclass a = new Bclass();
		Aclass b = new Bclass(); //다운 캐스팅
		System.out.println(b.x);// 10;
		//업캐스팅을 했을때 오버라이딩 안한 메서드와 모든 변수는 상위 클래스에서 찾는다.
		b.print(); //Bclass.print 실행 
		((Bclass)b).sub();

		Bclass c = (Bclass)b;

		Aclass d = new Aclass();
		//Bclass e = (Bclass)d; 업캐스팅  하지 않은 객체는 다운캐스팅 불가하다.
		//e.print();
	}
}
