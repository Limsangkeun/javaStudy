package inheritance;

class Test8{
	String name;
	int score;
	
	public Test8() {
		
	}
	public Test8(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void print() {
		System.out.println(name+":"+score);
	}
}


public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 t1 = new Test8("java",80);
		Test8 t2 = new Test8("java",80);
		
		System.out.println(t1==t2); //false.주소 비교
		System.out.println(t1.equals(t2)); //false.주소 비교
		
		//클래스명@해시코드
		System.out.println(t1);
		System.out.println(t1.toString());
	}

}
