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
			System.out.print("학번을 입력하세요 : ");
			key = br.readLine();
			if(map.containsKey(key)) {
				System.out.println("이미 존재하는 학번입니다....");
				return;
			}
			System.out.print("이름을 입력하세요 : ");
			value.setName(br.readLine());
			System.out.print("국어 성적을 입력하세요 : ");
			value.setKor(Integer.parseInt(br.readLine()));
			System.out.print("영어 성적을 입력하세요 : ");
			value.setEng(Integer.parseInt(br.readLine()));
			System.out.print("수학 성적을 입력하세요 : ");
			value.setMath(Integer.parseInt(br.readLine()));
			if(value.getKor() <0 || value.getKor() >100 || value.getEng() <0 || value.getEng()>100 || value.getMath() <0 || value.getMath()>100) {
				System.out.println("성적은 0~100사이만 가능합니다.");
				return;
			}
			map.put(key, value);
			System.out.println("성공적으로 데이터가 삽입되었습니다.");
		}catch (NumberFormatException e) {
			System.out.println("올바른 형태의 데이터를 입력하세요");
			return;
		}catch (IOException e) {
			System.out.println(e.toString());
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void print() {
		if(map.isEmpty()) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		System.out.println("전체 출력.... 현 인원수 : "+map.size());
		for(String s : map.keySet()) {
			System.out.printf("%10s\t%s\n",s,map.get(s));
		}
	}
	
	public void searchHak() {
		if(map.isEmpty()) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		String hak = getHak();
		if(hak == null)return;
		if(!map.containsKey(hak)) {
			System.out.println("해당 학번이 존재하지 않습니다.");
			return;
		}
		System.out.println(hak+"에 대한 정보 :");
		System.out.println(map.get(hak));
	}
	
	public void searchName() {
		if(map.isEmpty()) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		boolean isContain = false;
		try {
			System.out.println("검색할 이름을 입력하세요!");
			String name = br.readLine();
			for(String key : map.keySet()) {
				if(map.get(key).getName().startsWith(name)) {
					System.out.println(map.get(key));
					isContain = true;
				}
			}
			if(isContain == false) {
				System.out.println("해당 이름이 없습니다.");
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
			System.out.println("데이터가 없습니다.");
			return;
		}
		String hak = getHak();
		if(hak == null)return;
		if(!map.containsKey(hak)) {
			System.out.println("해당 학번이 존재하지 않습니다.");
			return;
		}
		try {
			MapVO value = new MapVO();
			value.setName(map.get(hak).getName());
			System.out.print("국어 성적을 입력하세요 : ");
			value.setKor(Integer.parseInt(br.readLine()));
			System.out.print("영어 성적을 입력하세요 : ");
			value.setEng(Integer.parseInt(br.readLine()));
			System.out.print("수학 성적을 입력하세요 : ");
			value.setMath(Integer.parseInt(br.readLine()));
			if(value.getKor() <0 || value.getKor() >100 || value.getEng() <0 || value.getEng()>100 || value.getMath() <0 || value.getMath()>100) {
				System.out.println("성적은 0~100사이만 가능합니다.");
				return;
			}
			map.put(hak, value);
			System.out.println("수정 완료하였습니다...");
		}catch(NumberFormatException e) {
			System.out.println("입력 형식이 잘못되었습니다.");
			return;
		}catch(IOException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void delete() {
		if(map.isEmpty()) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		String hak = getHak();
		if(hak == null)return;
		if(!map.containsKey(hak)) {
			System.out.println("해당 학번이 존재하지 않습니다.");
			return;
		}
		map.remove(hak);
		System.out.println("삭제 완료하였습니다...");
	}
	
	private String getHak() {
		String hak;
		try {
			System.out.print("학번을 입력하세요 : ");
			hak = br.readLine();
		}catch(Exception e) {
			System.out.println("학번 입력과정에서 오류가 발생하였습니다.");
			return null;
		}
		return hak;
	}
}
