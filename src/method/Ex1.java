package method;

class Method{
	//1~n까지의 합
	public int sum(int n) { //매개 변수이면서 동시에 지역 변수
		int sum = 0; //지역 변수
		for(int i=1; i<=n; i++) { 
			sum += i;
		}
		System.out.println(sum);
		return sum;  //반환 값
	}
	
	public int max(int a,int b) {
		return a>b?a:b;
	}
	
	public boolean isEven(int a) {
		return a%2==0;
	}

	public void drawingTri(int n) { //삼각형 그리기
		for(int i=1; i<=n; i++) {			//리턴을 만나면 호출한 곳으로 돌아가며, 리턴 타입이 void인 경우만 생략 가능하다.
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public char upper(char c) {
		return  c>='a'&&c<='z'?(char)(c-32):c;
		
	}
	
	//평점
	public double grade(int s) {
		if(s>=95&&s<=100) {
			return 4.5;
		}else if(s>=90&&s<95) {
			return 4.0;
		}else if(s>=85&&s<90) {
			return 3.5;
		}else if(s>=80&&s<85) {
			return 3.0;
		}else if(s>=75&&s<80) {
			return 2.5;
		}else if(s>=70&&s<75) {
			return 2.0;
		}else if(s>=65&&s<70) {
			return 1.5;
		}else if(s>=60&&s<65) {
			return 1.0;
		}else {
			return 0;
		}
	}
	
	public String hakjeom(int s) {
		s /=10;
		String result;
		switch(s) {
		case 10:
			result = "수";
			break;
		case 9:
			result = "수";
			break;
		case 8:
			result = "우";
			break;
		case 7:
			result = "미";
			break;
		case 6:
			result = "양";
			break;
		default :
			result = "가";
			break;
		}
		return result;
	}
	
	public void printGugu(int num) {
		if(num<1||num>9) {
			System.exit(0);
		}
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
	
	
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m = new Method();
		//System.out.println(m.sum(100));
		//System.out.println(m.isEven(100));
		//System.out.println(m.max(10, 5));
		//m.drawingTri(5); //void 메서드 호출 //void아니고 다른 형도 이런 형태로 호출 가능하나 결과값을 받을 수 없다.
		//System.out.println(m.upper('d'));
		//System.out.println(m.grade(65));
		//System.out.println(m.hakjeom(49));
		m.printGugu(0);
		m.printGugu(2);
	}
	

}
