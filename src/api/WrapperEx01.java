package api;


class Ex1{
	Integer a;  //객체는 null로 초기화 ->따라서 초기화 없이 연산하면 런타임에러 발생
	int b; 		//0으로 초기화
	
	public int sub1() {
		return a+10;
	}
	
	public int sub2() {
		return b+10;
	}
	
	
}
public class WrapperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 ob = new Ex1();
		//System.out.println(ob.sub1());//런타임 에러
		ob.a = 0;
		//jdk 5.0 부터 Integer a =10 이라는 코드를 Integer a = new Integer(10);으로 고쳐서 컴파일한다. 기본자료형을 Integer형으로 변환 -> 오토박싱
		int n = ob.a;
		//int n = a.intValue();와 같은 코드로 고쳐서 컴파일 한다. 객체를 기본자료형으로 ->오토 언박싱
		System.out.println(ob.sub1());
		System.out.println(ob.sub2());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String s;
		s="123";
		
		n = Integer.parseInt(s);
		System.out.println(n);
		s = "123.5";
		//n = Integer.parseInt(s); //런타임 오류 소수점 변환 불가 NumberFormatException //형식 오류
		double n2 = Double.parseDouble(s);
		System.out.println(n2);
		
		System.out.println(Integer.parseInt("101"));
		
		System.out.println(Integer.parseInt("101",2)); //parseInt("",2) 2진수라 알려주면 10진수로 변환한 값을 돌려줌
		System.out.println(Integer.parseInt("a01",16));
		
		n=245;
		s=Integer.toString(n);
		System.out.println(s);
		s=Integer.toBinaryString(123);
		System.out.println(s);
		
		n2 = Double.parseDouble("123.5");
		System.out.println(n2);
		
		
	}

}
