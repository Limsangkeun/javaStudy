package generic;
//this is Generic method;
//OverLoading�� ���ϰ� �ϴ� ����
class Test7<T>{
	private T t;
	
	public void set(T t) {
		this.t= t;
	}
	public T get() {
		System.out.println(t.getClass().getName().substring(10));
		return this.t;
	}
	
	public void print() {
		System.out.println(t.getClass().getName().substring(10));
	}
}

public class Generic07 {

	public static void main(String[] args) {
		Test7<Integer> t = new Test7<>();
		
		t.set(100);
		//Test7<Number> n = t; //������ ����ȯ ������ ����!
		
		Test7<?> t2 = t; //?�� ���� ���� �������� ���� �� //��ǻ�� ���� ������ ���ﶧ �̰� ���������� ���������� ���о��� �����ϰ� ���� ���� ����� ��쿡�� ����Ѵ�.
		//�ڷ����� ������� �迭 �ӿ� ������ ������� �˰� ������ �ϴ� ��Ƽ� List�� size(), clear() ��� ��ü���� �ڷ����� �ʿ���� ��� ���
		//�ڷ����� ���������� �ʱ� ������ ������ �Ұ����ϴ�. //���߿� ȯ���� ������ �ƴϴ�.
		
		//t2.set(20); //������ ���� //<?>�� �ڷ����� �������� �ʾұ⶧���� ���� ���� �� ����.
		((Test7<Integer>)t2).set(20); //���� �� ����ؾ��Ѵٸ�, ����̸� �Ⱦ��°� ���� ������
		t2.print(); //����. T�� ���������� �����Ƿ� ���� 
		System.out.println(t2.get());
	}
}
