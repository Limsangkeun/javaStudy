package score;

public class Score {
	ScoreVo list[];
	public Score() {
		
	}
	protected void allocation(int capacity) {
		ScoreVo temp[] = new ScoreVo[capacity];
		if(list!=null && list.length >0) {
			System.arraycopy(list, 0, temp, 0, list.length);
		}
		list = temp;
	}
	
	public ScoreVo[] getList() {
		return list;
	}
	
	public int getSize() {
		if(list==null) {
			return 0;
		}
		return list.length;
	}
}
