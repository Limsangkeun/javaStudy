package method;

class Method2 {
	// �ѹ��ڸ� �μ��� �Ѱ� �޾� ascii �ڵ带 �����ϴ� �޼ҵ�
	public int toAscii(char c) {
		return c;
	}
	
	//������ �ƽ�Ű �ڵ带 �μ��� �Ѱ� �޾� �ƽ�Ű �ڵ忡 ���� ���ڸ� �����ϴ� �޼ҵ�
	public char ascii2Char(int n) {
		return (char)n;
	}
	
	public boolean isLc(char c) {
		return c>='a'&&c<='z';
	}
	
	public int min(int a, int b) {
		return a>b?b:a;
	}
	
	
}

public class Ex2 {

	public static void main(String[] args) {
		Method2 m = new Method2();
		System.out.println(m.toAscii('A'));
		System.out.println(m.ascii2Char(65));
		System.out.println(m.isLc('a'));
	}

}
