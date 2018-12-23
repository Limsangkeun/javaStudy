package api;

public class Math_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d;
		d = Math.PI;
		System.out.println(d);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.pow(2,10));
		d=Math.sin(30.0 * Math.PI / 180); //sin 30도의 라디안
		System.out.println(d);
	
		d=Math.floor(12.77); //절삭
		System.out.println(d);
		d=Math.ceil(12.77); //
		System.out.println(d);
	}

}
