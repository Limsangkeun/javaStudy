package generic;

//������ Ÿ�� �Ķ����
//extends�� ����Ͽ� ������ Ÿ�Ը� �����ϵ��� �Ѵ�.
class Test3<T extends Number> { //Number�� �ڽĵ鸸 �����ϴ�. �� ���ڸ� �����ϵ���
	private T t;

	public void set(T t) {
		this.t = t;
	}
	public T get() {
		System.out.println(t.getClass().getName()); //���� t�� ��� �������� �ľ�.
		return t;
	}
}

public class Generic03 {
	
	
	public static void main(String[] args) {
		Test3<Integer> test = new Test3<>();
		//Test3<String> test2 = new Test3<>(); //������ ���� Number�� �ڽ��� �ƴϹǷ� ������ ������ �߻��Ѵ�.
		//test.set("String");������ ����
	}

}
