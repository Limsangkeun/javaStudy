package classStudy;


class Test5{
	//this는 필드나 메서드를 호출할때 사용하는 
	private int a=10;
	private static int b=20;
	
	public void sub1() {
		System.out.println(this.a+":"+b); //this.b는 가능하지만 클래스 변수는 객체 생성과 상관 없으므로 this.b로 표현하지 않는다.
		write(); //same
		this.write(); //same
	} 
	private void write() {
		System.out.println("write...");
	}
	public static void sub2() {
		//System.out.println(this.a);//컴파일 오류
		//static 메서드는 this 키워드를 사용할 수 없다. //this는 생성된 객체 자기 자신을 나타내므로
		//static 메서드는 객체 생성과 관련 없다.
		System.out.println(b);
	}
}
public class This_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
