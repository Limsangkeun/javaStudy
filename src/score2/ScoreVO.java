package score2;

public class ScoreVO { // �����Ϳ� Ŭ���� //�ʵ���� private���� ����ϰ� get/set���� ���
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int math;

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTot() {
		return this.kor+this.math+this.eng;
	}
}
