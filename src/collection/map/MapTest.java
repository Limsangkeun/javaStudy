package collection.map;
//HashMap을 이용한 성적 처리
//메뉴 1.입력 2.전체출력 3.학번검색 4.이름검색 5.수정 6.삭제 7.종료
//데이터 학번 : 키  값 : 이름, 국, 영, 수
//중복된 학번이 존재하면 알려준다.

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
					System.out.print("1.입력 2.전체출력 3.학번검색 4.이름검색 5.수정 6.삭제 7.종료 ? ");
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
