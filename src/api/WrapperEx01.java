package api;


class Ex1{
	Integer a;  //��ü�� null�� �ʱ�ȭ ->���� �ʱ�ȭ ���� �����ϸ� ��Ÿ�ӿ��� �߻�
	int b; 		//0���� �ʱ�ȭ
	
	public int sub1() {
		return a+10;
	}
	
	public int sub2() {
		return b+10;
	}
	
	
}
public class WrapperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 ob = new Ex1();
		//System.out.println(ob.sub1());//��Ÿ�� ����
		ob.a = 0;
		//jdk 5.0 ���� Integer a =10 �̶�� �ڵ带 Integer a = new Integer(10);���� ���ļ� �������Ѵ�. �⺻�ڷ����� Integer������ ��ȯ -> ����ڽ�
		int n = ob.a;
		//int n = a.intValue();�� ���� �ڵ�� ���ļ� ������ �Ѵ�. ��ü�� �⺻�ڷ������� ->���� ��ڽ�
		System.out.println(ob.sub1());
		System.out.println(ob.sub2());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String s;
		s="123";
		
		n = Integer.parseInt(s);
		System.out.println(n);
		s = "123.5";
		//n = Integer.parseInt(s); //��Ÿ�� ���� �Ҽ��� ��ȯ �Ұ� NumberFormatException //���� ����
		double n2 = Double.parseDouble(s);
		System.out.println(n2);
		
		System.out.println(Integer.parseInt("101"));
		
		System.out.println(Integer.parseInt("101",2)); //parseInt("",2) 2������ �˷��ָ� 10������ ��ȯ�� ���� ������
		System.out.println(Integer.parseInt("a01",16));
		
		n=245;
		s=Integer.toString(n);
		System.out.println(s);
		s=Integer.toBinaryString(123);
		System.out.println(s);
		
		n2 = Double.parseDouble("123.5");
		System.out.println(n2);
		
		
	}

}
