package method;

class Method2 {
	// 한문자를 인수로 넘겨 받아 ascii 코드를 리턴하는 메소드
	public int toAscii(char c) {
		return c;
	}
	
	//문자의 아스키 코드를 인수로 넘겨 받아 아스키 코드에 대한 문자를 리턴하는 메소드
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
