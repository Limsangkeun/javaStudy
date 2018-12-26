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
		System.out.println("\n������ �Է�...");
		
		try {
			ScoreVO vo = new ScoreVO();
			System.out.println("�й� ? ");
			vo.setHak(br.readLine());
			System.out.println("�̸� ? ");
			vo.setName(br.readLine());
			vo.setKor(inputScore("����"));
			vo.setEng(inputScore("����"));
			vo.setMath(inputScore("����"));
			System.out.printf("%10s\t%10s\t%3d\t%3d\t%3d\t\n",vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMath());
			list.add(vo);
			System.out.println("�ڷ� �߰� �Ϸ�...");
			
		}catch(IOException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void print() {
		System.out.println("\n��ü ����Ʈ....");
		System.out.println("��ü�ο��� : "+list.size());
		
		for(ScoreVO temp : list) {
			System.out.printf("%10s\t%10s\t%3d\t%3d\t%3d\t%3d\n",temp.getHak(),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTot());
		}
		System.out.println();
	}

	@Override
	public void searchName() {
		String name;
		try {
			System.out.println("�˻��� �̸��� �Է��ϼ���!");
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
				System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.\n");
				return;
			}
			System.out.println(hak+": �ش� �й��� ���� ������ ������ �����ϴ�.");
						System.out.printf("%10s\t%10s\t%3d\t%3d\t%3d\t%3d\n",temp.getHak(),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTot());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		System.out.println("\n�����Ϸ��� �й��� �Է��ϼ���...");
		String hak;
		try {
			hak = br.readLine();
			ScoreVO original = readScore(hak);
			ScoreVO vo = new ScoreVO(); //�ּ� ������ ó���ϹǷ� original�� �� ��ü�� ��Ÿ���� �ִ�. �׳� �������ϸ� �ȴ�. 
			//������ ���̷�Ʈ�� �����ϸ� �߰��� ���� �߻��� ������ ��� �� ���ɼ��� �����ϹǷ� ���������� �ؾ߰ڴ� ��
			if(original==null) {
				System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.\n");
				return;
			}
				int index = list.indexOf(original);
				System.out.println("�̸� ? ");
				vo.setName(br.readLine());
				vo.setKor(inputScore("����"));
				vo.setEng(inputScore("����"));
				vo.setMath(inputScore("����"));
				list.set(index, vo);
				System.out.println("�ڷ� ���� �Ϸ�...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void delete() {
		System.out.println("\n�����Ϸ��� �й��� �Է��ϼ���...");
		String hak;
		try {
			hak = br.readLine();
			ScoreVO vo = readScore(hak);
			if(vo==null) {
				System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.\n");
				return;
			}
			list.remove(vo);
			System.out.println("������ ���� �Ϸ�");
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
			if(n<0 || n>100) throw new Exception("������ 0~100 ���̸� �Է� �����մϴ�.");
		}catch(NumberFormatException e) {
			System.out.println("������ ���ڸ� �Է� �����մϴ�.");
			return inputScore(title);
			//throw new Exception("������ ���ڸ� �Է� �����մϴ�.");
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
		System.out.println("�̸� ������ �����մϴ�....");
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
		System.out.println("�й� ������ �����մϴ�....");
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
		System.out.println("���� ������ �����մϴ�....");
		Collections.sort(list, new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// TODO Auto-generated method stub
				return -(o1.getTot() - o2.getTot());//������������ ���
			}
			
		});
		print();
	}
}
