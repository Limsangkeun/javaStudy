package api;

public class DecimalFormat_Ex {
	//NumberFormat�� �߻�ũ�����̹� New�� ��ü ���� �Ұ�
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.text.DecimalFormat df = new java.text.DecimalFormat("#,##0"); //3�ڸ����� �޸��� ǥ���ϰڴ�.
		//java.text.DecimalFormat df = new java.text.DecimalFormat("#,##0.##"); //3�ڸ����� �޸��� ǥ���ϰڴ�
		java.text.DecimalFormat df = new java.text.DecimalFormat("#,##0.0#"); //3�ڸ����� �޸��� ǥ���ϰڴ�
		String s1 = df.format(123456);
		System.out.println(s1);
		
		s1 = df.format(123456.5688);
		System.out.println(s1);
	}

}
