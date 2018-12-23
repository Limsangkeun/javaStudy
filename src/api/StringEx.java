package api;

public class StringEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "seoul";
		//s1=0x100 0x100->"seoul"
		String s2 = "seoul";
		//메모리에 "seoul"이 존재하면 메모리 할당하지 않고 s2도 0x100주소를 할당받는다.
		
		String s3 = new String("seoul");
		//new를 만나면 "seoul"이 메모리에 있던 없던 메모리를 할당한다. 즉 0x200할당
		String s4 = "seoul";
		System.out.println(s1+":"+s2+":"+s3);
		System.out.println(s1==s2);//주소를 비교 한다.
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.hashCode());//hash code가 같다고 객체가 같은 것은 아니다.
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		//hashcode 만드는 방법에 의해 문자열을 해쉬코드로 변경했을때 동일한 문자열은 동일한 해쉬코드가 나온다.
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println("=========================");
		//String은 불변의 원칙 값이 변경되면 새로운 메모리로 변경된다.
		System.out.println(s1);
		s1+="korea";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);

		s3 = s3+10; //String + Integer => String
		System.out.println(s3);
		
	}

}
