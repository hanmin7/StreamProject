package intermediate;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	@Override
	public String toString() {
		String str = String.format("%s %s", name, score);
		return str;
	}


	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
	}


	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		boolean stdBool = this.name.equals(std.name);
		boolean scoreBool = this.score == std.score;
		return stdBool && scoreBool;
	}
	
	
	//(SortExample파일 하면서 수정됨 +)
	@Override
	public int compareTo(Student o) {
		//-1(음수) 오름차순
		//1(양수) 내림차순
		// 0
//		return this.score - o.score; //o는 매개값으로 들어오는 비교대상   (점수기준)
		return this.name.compareTo(o.name);  // compareTo라는 메소드는 문자열의 코드값을 가지고 비교함 (이름기준)
	}
	
}
