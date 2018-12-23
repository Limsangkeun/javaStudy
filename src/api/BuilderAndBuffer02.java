package api;
//���ڿ��� ���������� �����ؾ��ϴ� ����϶� String +���� �ϸ� ���ο� �޸𸮸� �����Ƿ� ��û�� ������ �ð��� ���� �߻��Ѵ�. �̷���� StringBuffer�� ���
//StringBuffer�� �����޸𸮿� �߰��ϴ� ���·� �ϹǷ� �ӵ��� ������. �׷��� ���� String���� �ٽ� ��ȯ�ؾ��ϹǷ� �� �ʿ��Ҷ��� ���
public class BuilderAndBuffer02 {

	public static void stringTime() {
		System.out.println("String...");
		
		long start = System.currentTimeMillis();
		//�Һ��� ��Ģ
		String s = "a";
		for(int i=1; i<100000; i++) 
			s+="a";//�̶����� ���ο� �޸𸮸� ��� ���� ���� ȸ�� ->�̷� ���� �ð���,������ ȿ���� ����
		System.out.println("���ڿ�����:"+s.length());
		long end = System.currentTimeMillis();
		System.out.println("����ð� : "+(end-start)+"ms");
	}
	public static void stringBufferTime() {
		System.out.println("StringBuffer...");
		
		long start = System.currentTimeMillis();
		StringBuffer s = new StringBuffer("a");
		for(int i=1; i<100000000; i++) 
			s.append("a");
		System.out.println("���ڿ�����:"+s.length());
		long end = System.currentTimeMillis();
		System.out.println("����ð� : "+(end-start)+"ms");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringTime();
		stringBufferTime();
		
	}

}
