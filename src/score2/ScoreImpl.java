package score2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ScoreImpl implements Score {
	private BufferedReader br;
	private List<ScoreVO> list;
	
	
	public ScoreImpl() {
		br = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<>();
	}
	@Override
	public void input() {
		System.out.println("\n데이터 입력...");
		
		try {
			ScoreVO vo = new ScoreVO();
			System.out.println("학번 ? ");
			vo.setHak(br.readLine());
			System.out.println("이름 ? ");
			vo.setName(br.readLine());
			vo.setKor(inputScore("국어"));
			vo.setEng(inputScore("영어"));
			vo.setMath(inputScore("수학"));
			System.out.printf("%10s\t%10s\t%3d\t%3d\t%3d\t\n",vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMath());
			list.add(vo);
			System.out.println("자료 추가 완료...");
			
		}catch(IOException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void print() {
		System.out.println("\n전체 리스트....");
		System.out.println("전체인원수 : "+list.size());
		
		for(ScoreVO temp : list) {
			System.out.printf("%10s\t%10s\t%3d\t%3d\t%3d\t%3d\n",temp.getHak(),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTot());
		}
		System.out.println();
	}

	@Override
	public void searchName() {
		String name;
		try {
			System.out.println("검색할 이름을 입력하세요!");
			name = br.readLine();
			for(ScoreVO temp : list) {
				if(temp.getName().startsWith(name)) {
								System.out.printf("%10s\t%10s\t%3d\t%3d\t%3d\t%3d\n",temp.getHak(),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTot());
				}
			}
		}catch(IOException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void searchHak() {
		String hak;
		
		try {
			hak = br.readLine();
			ScoreVO temp = readScore(hak);
			if(temp==null) {
				System.out.println("등록된 자료가 아닙니다.\n");
				return;
			}
			System.out.println(hak+": 해당 학번에 대한 정보는 다음과 같습니다.");
						System.out.printf("%10s\t%10s\t%3d\t%3d\t%3d\t%3d\n",temp.getHak(),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTot());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		System.out.println("\n수정하려는 학번을 입력하세요...");
		String hak;
		try {
			hak = br.readLine();
			ScoreVO original = readScore(hak);
			ScoreVO vo = new ScoreVO(); //주소 값으로 처리하므로 original이 그 객체를 나타내고 있다. 그냥 수정만하면 된다. 
			//하지만 다이렉트로 접근하면 중간에 에러 발생시 수정이 몇개만 될 가능성이 존재하므로 복제본으로 해야겠다 난
			if(original==null) {
				System.out.println("등록된 자료가 아닙니다.\n");
				return;
			}
				int index = list.indexOf(original);
				System.out.println("이름 ? ");
				vo.setName(br.readLine());
				vo.setKor(inputScore("국어"));
				vo.setEng(inputScore("영어"));
				vo.setMath(inputScore("수학"));
				list.set(index, vo);
				System.out.println("자료 수정 완료...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void delete() {
		System.out.println("\n삭제하려는 학번을 입력하세요...");
		String hak;
		try {
			hak = br.readLine();
			ScoreVO vo = readScore(hak);
			if(vo==null) {
				System.out.println("등록된 자료가 아닙니다.\n");
				return;
			}
			list.remove(vo);
			System.out.println("데이터 삭제 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
	
	private int inputScore(String title) throws Exception{
		int n=0;
		try {
			System.out.println(title+"? ");
			n = Integer.parseInt(br.readLine());
			if(n<0 || n>100) throw new Exception("성적은 0~100 사이만 입력 가능합니다.");
		}catch(NumberFormatException e) {
			System.out.println("점수는 숫자만 입력 가능합니다.");
			return inputScore(title);
			//throw new Exception("점수는 숫자만 입력 가능합니다.");
		}catch(Exception e) {
			throw e;
		}
		return n;
	}
	
	private ScoreVO readScore(String hak) {
		ScoreVO temp=null;
		Iterator<ScoreVO> it = list.iterator();
		
		while(it.hasNext()) {
			ScoreVO data = it.next();
			if(data.getHak().equals(hak)) {
				temp = data; 
				break;
			}
		}
		return temp;
	}
	@Override
	public void sortByName() {
		System.out.println("이름 순으로 정렬합니다....");
		Collections.sort(list, new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		print();
	}
	@Override
	public void sortByHak() {
		// TODO Auto-generated method stub
		System.out.println("학번 순으로 정렬합니다....");
		Collections.sort(list, new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		print();
	}
	@Override
	public void sortByScore() {
		// TODO Auto-generated method stub
		System.out.println("총점 순으로 정렬합니다....");
		Collections.sort(list, new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// TODO Auto-generated method stub
				return -(o1.getTot() - o2.getTot());//내림차순으로 출력
			}
			
		});
		print();
	}
}
