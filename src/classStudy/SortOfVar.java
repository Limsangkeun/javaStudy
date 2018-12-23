package classStudy;

import java.util.Arrays;

class Test2{
	//필드 : 인스턴스변수 + 클래스 변수
	//인스턴스 변수 //해당 되는 객체가 아주 오랫동안 사용되지 않을때 회수함 또는 객체에 NULL이 될때
	int a; //필드는 초기화 하지 않으면 정수형 변수는 0으로 초기화
	private int b=10; //선언하면서 초기화 가능 //private 정보 은닉닉
	
	static int c=10; // 클래스 변수 //클래스가 로딩되는 순간 메모리 할당을 한번만 받는다.
	
	//메서드는 메모리 할당과 상관 없다.
	public void sub1() { //인스턴스 메서드 , 객체가 생성되어야 사용가능\ 
		int b=0;
		System.out.println(a+":"+b+":"+c);
	}
	public static void sub2() { //클래스 메서드
		//System.out.println(a); //컴파일 오류 //인스턴스 변수는 사용 불가 //프로그램이 죽을때만 죽음 //오랜시간 사용하지 않아도 죽지 않음 //하나 밖에 메모리 할당 되지 않는다.
		System.out.println("클래스 메서드 : "+c); //클래스 변수는 호출 가능
	}

}
public class SortOfVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test = new Test2();
		//System.out.println(ob.a); // 컴파일 오류/ 객체는 메모리를 할당해야 사용 가능
		System.out.println(Test2.c); // 클래스 변수나 클래스 메소드는 메모리 할당과 상관없이 클래스 이름을 이용하여 바로 접근 가능
		Test2.sub2();
		//Test2.sub1();컴파일 오류 . 인스턴스 메서드는 객체를 통해서만 접근 가능 //메모리 할당하지 않은 경우 사용 불가 쓰려면 test.sub1();
		
		//객체의 메모리 할당
		test = new Test2();
		
		//객체 선언과 동시에 메모리 할당
		Test2 ob2 = new Test2();
		ob2.a = 10;
		System.out.println("ob.a: "+test.a);
		System.out.println("ob2.a : "+ob2.a);
		//System.out.println(test.b); private 변수이므로 외부에서 사용 불가능하다.
		System.out.println(test+":"+ob2);
		//System.out.println(test); //classStudy.Test2@15db9742 //패키지명.클래스명@해쉬코드 ->주소로 변환해서 처리
		Test2.c = 50;
		System.out.println(Test2.c);
		Test2 obj[] = new Test2[3]; //클래스 배열의 경우 선언만 한 상태이고 이후 추가로 메모리 할당 작업이 필요하다. //== Test2 1, Test2 2, Test2 3 처럼 선언만한 개념
		for(int i=0; i<obj.length; i++) {
			obj[i] = new Test2();
		}
		System.out.println(obj[0].a); //런타임 오류. 메모리 할당이 안된상태 널포인트 예외 발생
		System.out.println();
	}

}
