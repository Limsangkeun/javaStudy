package classStudy;

class Test6{
	private int a,b;
	public Test6() {
		//생성자에서만 다른 생성자의 코드를 호출해서 사용할 수 있다.
		this(1,2);//다른 생성자 호출. 객체가 또 생성되는 것이 아니라 단지 다른 생성자의 코드를 실행 this([인수]);는 생성자의 최 상단에서 한번만 호출 가능
		System.out.println("인자 없는 생성자...");
		//Test6(1,2); //컴오류
		
	}
	public Test6(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("인자 있는 생성자....");
	}
	
	public void write() {
		System.out.println(this.a+":"+this.b);
		//System.out.println(a+":"+b);//same
	}
}






public class This_Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t = new Test6();
		t.write();
	}
}
