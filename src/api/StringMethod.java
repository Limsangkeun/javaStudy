package api;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="seoul korea";
		String s2;
		int n;
		char c;
		
		System.out.println("s:"+s);
		
		n = s.length(); //���ڿ��� ����
		System.out.println("���� : "+n);
		
		//n = s2.length();������ ����//�ʱ�ȭ ��
		//s2 = null; //��Ÿ�� ����
		//n = s2.length();//��Ÿ�� ����
		
		//���� ����
		System.out.println(s.charAt(6)); //index�� 0����
		//���ڿ� ����
		System.out.println(s.substring(6, 9)); //kor ����
		//endIndex�� beginIndex ���� �۰ų� ������ ��Ÿ�� ���� �߻� (end-begin)�� ��ŭ begin���� ���
		System.out.println(s.substring(6));
		
		//�� ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea")); //��ҹ��� ���� ��
		System.out.println(s.equalsIgnoreCase("Seoul Korea")); //��ҹ��� ���о��� �� ��
		
		//�պκи� ��
		System.out.println(s.startsWith("seoul")); //seoul�� �����ϴ� ���ڿ� ã��
		//�޺κи� ��
		System.out.println(s.endsWith("korea")); //korea�� ������ ���ڿ� ã��
		
		//"seoul korea" : "seoul corea" ���ڿ� ��. �ٸ��� ascii �ڵ� �� //������ ��
		System.out.println(s.compareTo("seoul corea")); //k�� c �� �ٸ� �κ� �� ���� �պκ��� �������� ���ĺ� ���� ����
		//���̰� �����̸� , ����̸����� �Ǵ� �����ϴ�.
		
		//���ڰ� ���°�� ��ġ�� �ִ��� �ľ�
		System.out.println(s.indexOf("kor"));//6 ���� ���� ���ڰ� ��� ��ġ�� �����ϴ��� ����
		System.out.println(s.indexOf("cor"));//�ش� ���ڿ��� �������� ������ -1 0�̸� ���� �տ� ����
		
		System.out.println(s.indexOf("o"));
		//Seoul�� o�� �ƴ϶� Korea�� o�� ã�� ������
		System.out.println(s.lastIndexOf("o"));//�ڿ��� ���� ã���� //Ȯ���ڸ� ã����
		s="ABCD";
		System.out.println(s.indexOf(66)); //==System.out.println(s.indexOf('B'))
		System.out.println(s.indexOf('B',1));  //'B'�� n��ġ���� ���� �˻� n��ġ �������� ���° ��ġ����
		//�ƽ�Ű �ڵ�ε� ã���� �ִ�.
		
		s = s.toLowerCase(); //�����ؼ� �ٷ� ����ϰų� ������ �ٽ� �־ �ؾ��Ѵ�. //�Һ��� ��Ģ
		System.out.println(s);
		//Ȯ���ڸ� �����ϱ�
		String temp="test.12.png";
		System.out.println(temp.lastIndexOf("."));
		System.out.println(temp.substring(temp.lastIndexOf(".")+1));
		
		s = "�츮���� ���ѹα� ���ѵ�������";
		//s = s.replace("����", "����"); //�츮���� ���۹α� ���۵������� //���Խ� ���Ұ�
		s = s.replaceAll("����", "����"); //�츮���� ���۹α� ���۵������� //���Խ� ��밡�� //�Է°��� ���� �˻�(��,Ư�����,����)���� �����Ҷ� //���Խ��� �ſ� �߿�
		System.out.println(s);
		//replaceAll�� �� ���� ��
		
		//���� �����ϱ�
		s="�츮1��  �� ��5�� ��   111��";
		s2 = s.replaceAll("\\d",""); //\\d : ���ڸ� ��Ÿ���� ���Խ�
		//���ڿ� ���� �����ϱ� \\s == ����
		String s3 = s.replaceAll("\\d|\\s", ""); //�츮��������ڹ�
		System.out.println(s3);
		
		//�յ� ���� �����
		s="    ��   ��    ";
		System.out.println(":"+s+":");
		System.out.println(":"+s.trim()+":");
		System.out.println(":"+s.replaceAll("\\s", "")+":");
		
		//������ ���ڿ��� ��ȯ
		n=300;
		System.out.println(String.valueOf(n));
		System.out.println(Integer.toString(n));
		
		// ���ڿ��� ������
		s= "123"; //���� ���� ���ڿ��� ���� ����
		n = Integer.parseInt(s);
		System.out.println(n);
		
		//���Ŀ� �°� ���ڿ��� ��ȯ
		n=1234567;
		s=String.format("%,d",n); //3�ڸ� ���� �޸� �� String ���·� ��ȯ
		System.out.println(s);
		
		//Ư�� ���ڿ� �������� �и��ϱ�
		s="�ڹ�,�ȵ���̵�,��";
		//String s[] = "�ڹ�,�ȵ���̵�,��".split(",");
		for(String t : s.split(",")) {
			System.out.println(t);
		}
		
		//String to Byte[] ->
		s="KOREA";
		byte bb[]= s.getBytes();
		bb = "���ѹα�".getBytes(); //8�� �ѱ��� �ѱ��ڿ� 2����Ʈ�̹Ƿ�
		for(byte b:bb) {
			System.out.println(b); //����Ʈ �� ���
		}
		
				
	}

}
