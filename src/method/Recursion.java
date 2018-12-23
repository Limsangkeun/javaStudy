package method;
class Method6{
	public void print(int n) {//Àç±ÍÈ£Ãâ
		if(n>1) {
			print(n-1);
		}
		System.out.println(n);
	}
}
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method6 m = new Method6();
		m.print(5);
	}

}
