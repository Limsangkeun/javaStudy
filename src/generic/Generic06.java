package generic;
//this is Generic method;
//OverLoading�� ���ϰ� �ϴ� ����
class Test6<T>{
	private T t;
	
	public void set(T t) {
		this.t= t;
	}
	public T get() {
		System.out.println(t.getClass().getName().substring(10));
		return this.t;
	}
}

public class Generic06 {

	public static void main(String[] args) {
		Test6<Number> t1 = new Test6<>();
		t1.set(new Integer(10)); //Number������ Integer�� ���� �� �ִ�. �� ��� ���迡���� �����ϴ�.
		System.out.println(t1.get());
		
		//ĳ���� ���迡 ���Ͽ�
		Number nn = new Integer(50); //��ĳ����
		System.out.println(nn);
		
		Test6<Number> n1;
		Test6<Integer> n2 = new Test6<>();
		//n1 = n2;//������ ���� //���׸��� ���� ����! �ڱ� �ڽŸ� �����ϴ�. //�� �����ϴ�. //�̰� �Ǹ� �׳� Object ���°Ŷ� ���̰� ����		
		
	}

	

}
