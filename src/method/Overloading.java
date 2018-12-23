package method;

class Method8{
	public void sub() {
		System.out.println("인자 없는 메소드");
	}
	/*public int sub() { //컴파일 에러  .. 리턴 타입은 오버로딩의 조건이 아니다.
		return 1;
	}*/
	
	//this is overloading : 매개변수의 개수나 타입이 오버로딩의 조건이다.
	public void sub(int n) {
		System.out.println("int....");
	}
	
	public void sub(int n, String s) {
		System.out.println("int, String");
	}

	public void sub(short n) {
		System.out.println("short....");
	}

	
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method8 m = new Method8();
		byte b = 10;
		m.sub(b); //해당하는 자료형이 없으면 자기 사이즈와 가장 가까운 큰 자료형을 찾아서 출력한다. 여기서는 short
	}

}
