

public class Sangkeun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9; i++) {  //�� ���
			for(int j=1; j<=9; j++) { //������ ��
				if(i%2==0) {  //¦�� ���̸� 
					if(j%2==0) { //¦�� ������ 
						continue;  //�ǳ� ����
					}
				}else { //Ȧ�����̸�
					if(j%2==1) { //Ȧ�� ������
						continue; //�ǳʶ���
					}
				}
				System.out.printf("%d*%d=%d\n",i,j,(i*j));
				
			}
			System.out.println();
		}
	}
}
