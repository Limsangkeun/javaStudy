package collection.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapService {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Map<String,MapVO> map = new HashMap<>();
	public void input() {
		String key;
		MapVO value = new MapVO();
		try {
			System.out.print("�й��� �Է��ϼ��� : ");
			key = br.readLine();
			if(map.containsKey(key)) {
				System.out.println("�̹� �����ϴ� �й��Դϴ�....");
				return;
			}
			System.out.print("�̸��� �Է��ϼ��� : ");
			value.setName(br.readLine());
			System.out.print("���� ������ �Է��ϼ��� : ");
			value.setKor(Integer.parseInt(br.readLine()));
			System.out.print("���� ������ �Է��ϼ��� : ");
			value.setEng(Integer.parseInt(br.readLine()));
			System.out.print("���� ������ �Է��ϼ��� : ");
			value.setMath(Integer.parseInt(br.readLine()));
			if(value.getKor() <0 || value.getKor() >100 || value.getEng() <0 || value.getEng()>100 || value.getMath() <0 || value.getMath()>100) {
				System.out.println("������ 0~100���̸� �����մϴ�.");
				return;
			}
			map.put(key, value);
			System.out.println("���������� �����Ͱ� ���ԵǾ����ϴ�.");
		}catch (NumberFormatException e) {
			System.out.println("�ùٸ� ������ �����͸� �Է��ϼ���");
			return;
		}catch (IOException e) {
			System.out.println(e.toString());
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void print() {
		if(map.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return;
		}
		System.out.println("��ü ���.... �� �ο��� : "+map.size());
		for(String s : map.keySet()) {
			System.out.printf("%10s\t%s\n",s,map.get(s));
		}
	}
	
	public void searchHak() {
		if(map.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return;
		}
		String hak = getHak();
		if(hak == null)return;
		if(!map.containsKey(hak)) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.println(hak+"�� ���� ���� :");
		System.out.println(map.get(hak));
	}
	
	public void searchName() {
		if(map.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return;
		}
		boolean isContain = false;
		try {
			System.out.println("�˻��� �̸��� �Է��ϼ���!");
			String name = br.readLine();
			for(String key : map.keySet()) {
				if(map.get(key).getName().startsWith(name)) {
					System.out.println(map.get(key));
					isContain = true;
				}
			}
			if(isContain == false) {
				System.out.println("�ش� �̸��� �����ϴ�.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void update() {
		if(map.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return;
		}
		String hak = getHak();
		if(hak == null)return;
		if(!map.containsKey(hak)) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
			return;
		}
		try {
			MapVO value = new MapVO();
			value.setName(map.get(hak).getName());
			System.out.print("���� ������ �Է��ϼ��� : ");
			value.setKor(Integer.parseInt(br.readLine()));
			System.out.print("���� ������ �Է��ϼ��� : ");
			value.setEng(Integer.parseInt(br.readLine()));
			System.out.print("���� ������ �Է��ϼ��� : ");
			value.setMath(Integer.parseInt(br.readLine()));
			if(value.getKor() <0 || value.getKor() >100 || value.getEng() <0 || value.getEng()>100 || value.getMath() <0 || value.getMath()>100) {
				System.out.println("������ 0~100���̸� �����մϴ�.");
				return;
			}
			map.put(hak, value);
			System.out.println("���� �Ϸ��Ͽ����ϴ�...");
		}catch(NumberFormatException e) {
			System.out.println("�Է� ������ �߸��Ǿ����ϴ�.");
			return;
		}catch(IOException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void delete() {
		if(map.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return;
		}
		String hak = getHak();
		if(hak == null)return;
		if(!map.containsKey(hak)) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
			return;
		}
		map.remove(hak);
		System.out.println("���� �Ϸ��Ͽ����ϴ�...");
	}
	
	private String getHak() {
		String hak;
		try {
			System.out.print("�й��� �Է��ϼ��� : ");
			hak = br.readLine();
		}catch(Exception e) {
			System.out.println("�й� �Է°������� ������ �߻��Ͽ����ϴ�.");
			return null;
		}
		return hak;
	}
}
