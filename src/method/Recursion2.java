package method;


public class Recursion2 {
	public static int sum(int n) {
		return n>1 ? n+sum(n-1) : n;
	}
	public static int pow(int x, int y) {
		return y>1 ? x*pow(x,y-1) : x;
	}
	public static int gcd(int a, int b){
		return b==a ? a : gcd(b, b%a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		
		s=sum(10);
		System.out.println(s);
		s = pow(2,10);
		System.out.println(s);
		s = gcd(16,12);
		System.out.println(s);
	}
}
