package inheritance;
//oop 1.상속 2.다형성 3.캡슐화

class Test6{
	int x=10;
	
	public void print() {
		System.out.println("x:"+x);
	}
}

class Sample6 extends Test6{
	int y=20;
	
	public void print(int a) { //오버라이딩 아니고 오버로딩 
		System.out.println("y:"+y);
	}
	//위와 같이 실수로 매개변수를 넣었을 경우에 대한 확인이 필요하다. 이럴때 어노테이션을 이용하여 컴파일러에게 정보를 준다. //재정의 규칙에 위반되면 컴파일 에러가 발생한다.
	@Override
	public void print() { //Override(재정의) : 상위 클래스의 메소드를 재정의 
		System.out.println("y:"+y);
	}
	public void sub() { //우선 순위는 자기 자신의 메소드가 더 높다.
		//print(); // 자기 자신의 클래스의 메소드 호출
		super.print(); //super클래스의 메소드 호출
	}
}
public class Overriding_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample6 ob = new Sample6();
		ob.print(); //자식의 print함수가 없으면 부모의 print함수를 부른다. 자식 print가 있는 상황에서 부모의 print는 부를수 없다.
	}
	
	

}
