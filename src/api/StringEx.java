package api;

public class StringEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "seoul";
		//s1=0x100 0x100->"seoul"
		String s2 = "seoul";
		//�޸𸮿� "seoul"�� �����ϸ� �޸� �Ҵ����� �ʰ� s2�� 0x100�ּҸ� �Ҵ�޴´�.
		
		String s3 = new String("seoul");
		//new�� ������ "seoul"�� �޸𸮿� �ִ� ���� �޸𸮸� �Ҵ��Ѵ�. �� 0x200�Ҵ�
		String s4 = "seoul";
		System.out.println(s1+":"+s2+":"+s3);
		System.out.println(s1==s2);//�ּҸ� �� �Ѵ�.
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.hashCode());//hash code�� ���ٰ� ��ü�� ���� ���� �ƴϴ�.
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		//hashcode ����� ����� ���� ���ڿ��� �ؽ��ڵ�� ���������� ������ ���ڿ��� ������ �ؽ��ڵ尡 ���´�.
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println("=========================");
		//String�� �Һ��� ��Ģ ���� ����Ǹ� ���ο� �޸𸮷� ����ȴ�.
		System.out.println(s1);
		s1+="korea";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);

		s3 = s3+10; //String + Integer => String
		System.out.println(s3);
		
	}

}
