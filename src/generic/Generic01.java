package generic;

import java.util.Arrays;

class Test1 {
	private Object obj;

	public void set(Object obj) {
		this.obj = obj;
	}

	public Object get() {
		return obj;
	}
}

public class Generic01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object 클래스의 위험성
		
		Test1 oo =new Test1();
		oo.set("korea");
		String s = (String)oo.get();
		System.out.println(s.length());
		
		/*oo.set(100);
		s = (String)oo.get(); //런타임 에러 캐스팅 익셉션
		System.out.println(s.length());*/
		
		/*
		Object o[] = {"korea","seoul",new Integer(30)};
		Arrays.sort(o);
		for(int i=0; i<o.length; i++) {
			System.out.println(o[i]);
		}*/ //이런식으로 짜는 프로그램은 올바르지 못한 프로그램이다. //오류를 범할 가능성이 농후하다.
		
		//따라서 다양한 형태를 받고 싶으면  오버로딩을 통해 해결할 수도 있지만, 너무 귀찮으므로 제네릭을 통해서 해결하자 다음 코드로=>>>
	}

}
