package api;
//중요하다이거

public class BuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuilder, StringBuffer : 가변적인 문자열을 처리할 때, String 보다 유리
		//StringBuilder : 동기화 지원하지 않음. StringBuffer 보다 빠름
		//StringBuffer : 동기화 지원
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("korea");
		
		//버퍼의 크기
		System.out.println("기본버퍼크기 : "+sb.capacity());
		
		
		sb.append("korea");
		System.out.println("기본버퍼크기 : "+sb.capacity());
		System.out.println(sb);
		System.out.println(sb2);
		
		System.out.println(sb==sb2); //주소. false;
		System.out.println(sb.equals(sb2)); //주소. false; //String만 값을 비교하고 나머지는 주소를 비교한다.
		//어쩔수 없는 경우는 String으로 변환해야한다.
		//그렇다면 왜 사용하는가?
		
		//String으로 변환
		String s = sb.toString();
		System.out.println(s);
		//String으로 변환하여 비교
		System.out.println(sb.toString().equals(sb2.toString())); //값 비교. true
		
		sb.append("java");
		sb.append("servlet");
		sb.append("jsp");
		sb.append("html");
		sb.append("spring");
		sb.append("framework");
		sb.append("javascript");
		//sb의 버퍼의 크기
		System.out.println("기본버퍼크기 : "+sb.capacity());
		//sb의 문자열길이
		System.out.println("문자열 길이 : "+sb.length());
		System.out.println(sb);
		sb.insert(0, "한국");
		sb.insert(sb.indexOf("jsp")+"jsp".length(), "web");
		sb.delete(sb.indexOf("javascript"),sb.indexOf("javascript")+"javascript".length());
		System.out.println(sb);
		sb.delete(0, sb.length()); //모두 지우기
		System.out.println(sb);
		sb.append("seoul");
		System.out.println(sb.capacity()); //buffer크기는 자동으로 줄지 않는다.
		sb.trimToSize();//문자열길이로 버퍼의 크기를 변경
		System.out.println(sb.capacity());
	}

}
