package api;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="seoul korea";
		String s2;
		int n;
		char c;
		
		System.out.println("s:"+s);
		
		n = s.length(); //문자열의 길이
		System.out.println("길이 : "+n);
		
		//n = s2.length();컴파일 오류//초기화 요
		//s2 = null; //런타임 오류
		//n = s2.length();//런타임 오류
		
		//문자 추출
		System.out.println(s.charAt(6)); //index는 0부터
		//문자열 추출
		System.out.println(s.substring(6, 9)); //kor 추출
		//endIndex가 beginIndex 보다 작거나 같으면 런타임 에러 발생 (end-begin)개 만큼 begin부터 출력
		System.out.println(s.substring(6));
		
		//값 비교
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea")); //대소문자 구분 비교
		System.out.println(s.equalsIgnoreCase("Seoul Korea")); //대소문자 구분없이 값 비교
		
		//앞부분만 비교
		System.out.println(s.startsWith("seoul")); //seoul로 시작하는 문자열 찾기
		//뒷부분만 비교
		System.out.println(s.endsWith("korea")); //korea로 끝나는 문자열 찾기
		
		//"seoul korea" : "seoul corea" 문자열 비교. 다르면 ascii 코드 값 //사전식 비교
		System.out.println(s.compareTo("seoul corea")); //k와 c 비교 다른 부분 중 가장 앞부분을 기준으로 알파벳 차이 리턴
		//차이가 음수이면 , 양수이면으로 판단 가능하다.
		
		//문자가 몇번째에 위치해 있는지 파악
		System.out.println(s.indexOf("kor"));//6 가장 앞의 숫자가 어느 위치에 존재하는지 리턴
		System.out.println(s.indexOf("cor"));//해당 문자열이 존재하지 않으면 -1 0이면 가장 앞에 존재
		
		System.out.println(s.indexOf("o"));
		//Seoul의 o가 아니라 Korea의 o를 찾고 싶을때
		System.out.println(s.lastIndexOf("o"));//뒤에서 부터 찾을때 //확장자를 찾을때
		s="ABCD";
		System.out.println(s.indexOf(66)); //==System.out.println(s.indexOf('B'))
		System.out.println(s.indexOf('B',1));  //'B'를 n위치에서 부터 검색 n위치 기준으로 몇번째 위치인지
		//아스키 코드로도 찾을수 있다.
		
		s = s.toLowerCase(); //변경해서 바로 사용하거나 변수에 다시 넣어서 해야한다. //불변의 원칙
		System.out.println(s);
		//확장자만 추출하기
		String temp="test.12.png";
		System.out.println(temp.lastIndexOf("."));
		System.out.println(temp.substring(temp.lastIndexOf(".")+1));
		
		s = "우리나라 대한민국 대한독립만세";
		//s = s.replace("대한", "大韓"); //우리나라 大韓민국 大韓독립만세 //정규식 사용불가
		s = s.replaceAll("대한", "大韓"); //우리나라 大韓민국 大韓독립만세 //정규식 사용가능 //입력값에 대한 검사(욕,특정언어,숫자)등을 수행할때 //정규식은 매우 중요
		System.out.println(s);
		//replaceAll을 더 많이 씀
		
		//숫자 제거하기
		s="우리1나  라 대5한 자   111바";
		s2 = s.replaceAll("\\d",""); //\\d : 숫자를 나타내는 정규식
		//숫자와 공백 제거하기 \\s == 공백
		String s3 = s.replaceAll("\\d|\\s", ""); //우리나라대한자바
		System.out.println(s3);
		
		//앞뒤 공백 지우기
		s="    사   랑    ";
		System.out.println(":"+s+":");
		System.out.println(":"+s.trim()+":");
		System.out.println(":"+s.replaceAll("\\s", "")+":");
		
		//정수를 문자열로 변환
		n=300;
		System.out.println(String.valueOf(n));
		System.out.println(Integer.toString(n));
		
		// 문자열을 정수로
		s= "123"; //순수 정수 문자열만 변경 가능
		n = Integer.parseInt(s);
		System.out.println(n);
		
		//형식에 맞게 문자열로 변환
		n=1234567;
		s=String.format("%,d",n); //3자리 마다 콤마 찍어서 String 형태로 반환
		System.out.println(s);
		
		//특정 문자열 기준으로 분리하기
		s="자바,안드로이드,웹";
		//String s[] = "자바,안드로이드,웹".split(",");
		for(String t : s.split(",")) {
			System.out.println(t);
		}
		
		//String to Byte[] ->
		s="KOREA";
		byte bb[]= s.getBytes();
		bb = "대한민국".getBytes(); //8개 한글은 한글자에 2바이트이므로
		for(byte b:bb) {
			System.out.println(b); //바이트 값 출력
		}
		
				
	}

}
