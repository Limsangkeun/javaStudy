package api;
//문자열을 가변적으로 결합해야하는 경우일때 String +으로 하면 새로운 메모리를 잡으므로 엄청난 공간적 시간적 낭비가 발생한다. 이럴경우 StringBuffer를 사용
//StringBuffer는 기존메모리에 추가하는 형태로 하므로 속도가 빠르다. 그러나 끝엔 String으로 다시 변환해야하므로 꼭 필요할때만 써라
public class BuilderAndBuffer02 {

	public static void stringTime() {
		System.out.println("String...");
		
		long start = System.currentTimeMillis();
		//불변의 원칙
		String s = "a";
		for(int i=1; i<100000; i++) 
			s+="a";//이때마다 새로운 메모리를 잡고 기존 공간 회수 ->이로 인한 시간적,공간적 효율성 저하
		System.out.println("문자열길이:"+s.length());
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : "+(end-start)+"ms");
	}
	public static void stringBufferTime() {
		System.out.println("StringBuffer...");
		
		long start = System.currentTimeMillis();
		StringBuffer s = new StringBuffer("a");
		for(int i=1; i<100000000; i++) 
			s.append("a");
		System.out.println("문자열길이:"+s.length());
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : "+(end-start)+"ms");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringTime();
		stringBufferTime();
		
	}

}
