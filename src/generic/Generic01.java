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
		
		//Object Ŭ������ ���輺
		
		Test1 oo =new Test1();
		oo.set("korea");
		String s = (String)oo.get();
		System.out.println(s.length());
		
		/*oo.set(100);
		s = (String)oo.get(); //��Ÿ�� ���� ĳ���� �ͼ���
		System.out.println(s.length());*/
		
		/*
		Object o[] = {"korea","seoul",new Integer(30)};
		Arrays.sort(o);
		for(int i=0; i<o.length; i++) {
			System.out.println(o[i]);
		}*/ //�̷������� ¥�� ���α׷��� �ùٸ��� ���� ���α׷��̴�. //������ ���� ���ɼ��� �����ϴ�.
		
		//���� �پ��� ���¸� �ް� ������  �����ε��� ���� �ذ��� ���� ������, �ʹ� �������Ƿ� ���׸��� ���ؼ� �ذ����� ���� �ڵ��=>>>
	}

}
