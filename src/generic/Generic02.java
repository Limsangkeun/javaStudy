package generic;

//this is Generic; <T> ������ ���� �ٸ��� ���� ���� ������ �����ؾ������� �̸� �ذ��ϱ� ���� �ϳ��� ������ �޼���� ��� ���¸� ó���ϱ� ���� ������� ��
//�Ϲ������� �ش��ϴ� �빮�� �ϳ� ���
//���� ���ε��̹Ƿ� �ƹ����� ���� ���ε� ���� �ӵ��� ������.
class Test2<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		System.out.println(t.getClass()); //���� t�� ��� �������� �ľ�.
		return t;
	}
}

public class Generic02 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList�� �̷��� �����Ǿ��ֱ���

		Test2<String> t1 = new Test2<>();
		t1.set("korea");
		System.out.println(t1.get().length());
		Test2<Integer> t2 = new Test2<>();
		t2.set(100);
		System.out.println(t2.get());
		
		Test2 t3 = new Test2(); //������ �ǳ� ���׸��� ����ϵ��� ����ǰ� �ִ�.
		t3.set("aaa");
		System.out.println(((String)t3.get()).length());
		//������ �� �� ������ ���� �˻��ϹǷ� ���� Ʋ���� ������ ������ �߻����� ������ Ȯ���� �����ϴ�.
	}

}
