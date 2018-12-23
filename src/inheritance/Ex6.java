package inheritance;

class Test9{
	String name;
	int score;
	
	public Test9() {
		
	}
	public Test9(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void print() {
		System.out.println(name+":"+score);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//System.out.println(obj.name);
		//String s = (Test9)obj.name; // ��ȣ���� .�� �켱������ ���� obj.name�� Test9�� ĳ�����ϴ� ���°� �Ǵµ� �̴� Ȱ���� �� ���� ���°� �ǹǷ� ������ ������ �߻��Ѵ�.
		//��� obj�� Test9�� ��Ÿ���� ������, �����Ϸ��� ������ �ܰ迡�� Object Ŭ������ �ʵ带 ����. �׷��� �ٷ� Test9�� �ʵ带 �� �� ����.
		
		//obj.name�� Ȱ���ϰ� �������
		//((Test9)obj).name; ���·� ����ؾ��Ѵ�.
		// name => this.name
		if(obj instanceof Test9) {
			Test9 temp = (Test9)obj;
			return ((this.name.equals(temp.name) && this.score==temp.score));
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+score;
	}
}


public class Ex6 {
	//Overriding & casting
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 t1 = new Test9("java",80);
		Test9 t2 = new Test9("java",80);
		System.out.println(t1==t2); //false.�ּ� ��
		System.out.println(t1.equals(t2)); //false.�ּ� ��
		//Ŭ������@�ؽ��ڵ�
		System.out.println(t1); //t1 == t1.toString();
		System.out.println(t1.toString());
	}

}
