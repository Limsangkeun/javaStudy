package method;

class Method8{
	public void sub() {
		System.out.println("���� ���� �޼ҵ�");
	}
	/*public int sub() { //������ ����  .. ���� Ÿ���� �����ε��� ������ �ƴϴ�.
		return 1;
	}*/
	
	//this is overloading : �Ű������� ������ Ÿ���� �����ε��� �����̴�.
	public void sub(int n) {
		System.out.println("int....");
	}
	
	public void sub(int n, String s) {
		System.out.println("int, String");
	}

	public void sub(short n) {
		System.out.println("short....");
	}

	
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method8 m = new Method8();
		byte b = 10;
		m.sub(b); //�ش��ϴ� �ڷ����� ������ �ڱ� ������� ���� ����� ū �ڷ����� ã�Ƽ� ����Ѵ�. ���⼭�� short
	}

}
