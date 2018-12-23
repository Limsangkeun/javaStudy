package method;
class Method5{
	public void sub1(int[] n) { //파라미터가 배열. call by reference;
		n[1] = 10;
		
		for(int a:n)
			System.out.println(a+" ");
		System.out.println();
	}
	
	public int[] random(int cnt) {
		int n[] = new int[cnt];
		for(int i=0; i<n.length; i++) {
			n[i] = (int)(Math.random()*100)+1;
		}
		return n;
	}
}
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4,5};
		num = new int[0];
		System.out.println(num.length);
		num = new int[]{1,2,3,4,5};
		Method5 m = new Method5();
		m.sub1(num);
		System.out.println(num[1]);
		
		num = m.random(65);
		for(int i: num) {
			System.out.print(i+" ");
		}
	}
}
