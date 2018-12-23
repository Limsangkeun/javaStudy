package api;
//�߿��ϴ��̰�

public class BuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuilder, StringBuffer : �������� ���ڿ��� ó���� ��, String ���� ����
		//StringBuilder : ����ȭ �������� ����. StringBuffer ���� ����
		//StringBuffer : ����ȭ ����
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("korea");
		
		//������ ũ��
		System.out.println("�⺻����ũ�� : "+sb.capacity());
		
		
		sb.append("korea");
		System.out.println("�⺻����ũ�� : "+sb.capacity());
		System.out.println(sb);
		System.out.println(sb2);
		
		System.out.println(sb==sb2); //�ּ�. false;
		System.out.println(sb.equals(sb2)); //�ּ�. false; //String�� ���� ���ϰ� �������� �ּҸ� ���Ѵ�.
		//��¿�� ���� ���� String���� ��ȯ�ؾ��Ѵ�.
		//�׷��ٸ� �� ����ϴ°�?
		
		//String���� ��ȯ
		String s = sb.toString();
		System.out.println(s);
		//String���� ��ȯ�Ͽ� ��
		System.out.println(sb.toString().equals(sb2.toString())); //�� ��. true
		
		sb.append("java");
		sb.append("servlet");
		sb.append("jsp");
		sb.append("html");
		sb.append("spring");
		sb.append("framework");
		sb.append("javascript");
		//sb�� ������ ũ��
		System.out.println("�⺻����ũ�� : "+sb.capacity());
		//sb�� ���ڿ�����
		System.out.println("���ڿ� ���� : "+sb.length());
		System.out.println(sb);
		sb.insert(0, "�ѱ�");
		sb.insert(sb.indexOf("jsp")+"jsp".length(), "web");
		sb.delete(sb.indexOf("javascript"),sb.indexOf("javascript")+"javascript".length());
		System.out.println(sb);
		sb.delete(0, sb.length()); //��� �����
		System.out.println(sb);
		sb.append("seoul");
		System.out.println(sb.capacity()); //bufferũ��� �ڵ����� ���� �ʴ´�.
		sb.trimToSize();//���ڿ����̷� ������ ũ�⸦ ����
		System.out.println(sb.capacity());
	}

}
