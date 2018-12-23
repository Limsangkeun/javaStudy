package api;


class Ex2{ //object 클래스를 상속 받음
	//private int a=10, b=20; //필드는 따로 따로 적어라 이런식으로 하면 혼남
	private int a=10;//like this
	private int b=20;
	
	public void sub() {
		System.out.println(a+":"+b);
	}
	
	/*@Override
	public String toString() {
	//	return a+b;
	}*/
}
public class ObjectEx { //Object 클래스를 상속 받음

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 ob = new Ex2();
		Ex2 ob2 = new Ex2();
		System.out.println(ob.toString()); //toString은 Object클래스의 메서드.. 기본적으로 클래스는 Object 클래스를 상속받는다. //클래스 이름@해쉬코드
		System.out.println(ob2);//ob == ob.toString()
		Object ob3 = new Object();
		//Ex3클래스는  오브젝트 클래스의 메서드는 사용가능하나 오브젝트 클래스 객체는 자식 클래스인 Ex2의 메서드를 사용할 수 없다.
		
		System.out.println(ob.equals(ob2)); 
		System.out.println(ob==ob2);
		
		System.out.println(ob.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println("===================");
		
		
		//오버라이딩 : 부모 클래스의 함수를 재정의 해서 사용
	}
}
