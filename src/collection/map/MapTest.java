package collection.map;
//HashMap�� �̿��� ���� ó��
//�޴� 1.�Է� 2.��ü��� 3.�й��˻� 4.�̸��˻� 5.���� 6.���� 7.����
//������ �й� : Ű  �� : �̸�, ��, ��, ��
//�ߺ��� �й��� �����ϸ� �˷��ش�.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MapService service = new MapService();
		int ch = -1;
		
		while(true) {
			do {
				try {
					System.out.print("1.�Է� 2.��ü��� 3.�й��˻� 4.�̸��˻� 5.���� 6.���� 7.���� ? ");
					ch = Integer.parseInt(br.readLine());
				}catch(Exception e) {
					System.out.println(e.toString());
				}
			}while(ch<1||ch>7);
			if(ch==7)break;
			switch(ch) {
			case 1:service.input();break;
			case 2:service.print();break;
			case 3:service.searchHak();break;
			case 4:service.searchName();break;
			case 5:service.update();break;
			case 6:service.delete();break;
			}
		}
	}

}
