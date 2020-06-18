package basic;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.Arrays;

class Student{
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() { return this.name; }
	public int getScore() {return this.score; }
}
public class FromCollectionExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong", 35), new Student("Hwang", 55), new Student("Park", 60));
		
		
//		Stream<Student> stream = students.stream(); //Stream : 반복자...
//		stream.forEach(new Consumer<Student>() {
//			@Override
//			public void accept(Student t) {
//				System.out.println(t.getName() + ", " + t.getScore());
//			}
//		});
		
//		students.stream().forEach(new~~~); 위에 스트림 선언 안하고 이렇게 바로 적어도 ㄱㅊ. 이러면 한 줄에 다 적을 수 있으니까... 아래참고..
		
		// 아래는 람다로 완전 다 줄인거.
		students.stream().forEach( (t)-> System.out.println(t.getName() + ", " + t.getScore()));
		
		
		
		//50점이상인 애들 거르기
		Predicate<Student> predicate = new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getScore() > 50;
			}
		};
		//아래 filter안에꺼를 위에 저렇게 빼서 구현해도 ㄱㅊ  그럼 filter에는 filter(predicate) 넣으면 ㅇㅇ
		//어차피 한번쓸꺼고 한줄에 다 쓸 수 있는데 굳이 따로 빼서 쓰는건 비효울적이니까 줄여쓰는거 연습~
		
		students.stream().filter(t -> t.getScore()>50).forEach((t)-> System.out.println(t.getName() + ", " + t.getScore()));
		
		
	}
}
