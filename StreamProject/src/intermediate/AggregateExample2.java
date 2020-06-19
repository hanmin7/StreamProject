package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class AggregateExample2 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong", 55), new Student("Hwang", 67), new Student("Park", 88));
		
		int result = students.stream().mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getScore();
			}
			
		}).sum();
		System.out.println("집계결과: " + result);
		
		
		//reduce이용
		result = students.stream().mapToInt(s -> s.getScore())
				.reduce(new IntBinaryOperator() {
					@Override
					public int applyAsInt(int left, int right) {
						System.out.println("left: " + left + ", right: " + right); //left, right 값 보여주는거
						return left + right; //내가 원하는 집계처리방식 정의 할 수 있음
					}
				}).getAsInt();
		System.out.println("집계결과2: " + result);
		
		
		//에러발생시켜서보고 , reduce 2개 값 넣는걸로 써보기
		
		result = students.stream().filter(n -> n.getScore() > 100)
				.mapToInt(s -> s.getScore())
				.reduce(0, new IntBinaryOperator() { // reduce 2개 값넣는거로 쓰면 int반환이라서 getAsInt필요없음. 초기값설정가능. 0이  값이없을 때 디폴트설정값 넣는자리임 
					@Override
					public int applyAsInt(int left, int right) {
						return left + right;
					}
				});
		System.out.println("집계결과3: " + result);
		
		
	}//end of main
}
