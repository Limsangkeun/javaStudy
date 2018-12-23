package interfaceEx;

interface Ex5 {
	int A=10; //public final static int A=10; 과 동일 
			  //final static이므로 선언만 하면 안되고 초기화까지 해줘야한다.
	public void print();
}
class ExImpl5 implements Ex5 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print...");
	}
	
}
public class InterfaceEx5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ExImpl5.A);
		System.out.println(Ex5.A);
	}
}
