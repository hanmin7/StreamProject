package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DistinctExample {
	public static void main(String[] args) {
		IntStream is = IntStream.of(1,2,2,3,3,5,6,5);
//		int sum = 0;
//		sum = is.distinct().peek(System.out::println).sum(); //끝에 sum()같이 최종처리메소드가 있어야 실행이 됨.
//		System.out.println("sum: " + sum);
		
		List<Student> list = Arrays.asList(new Student("Hong", 33),
											new Student("Hong", 33),
											new Student("Hwang", 37),
											new Student("Park", 44));
		list.stream().distinct().forEach(System.out::println); //(s -> System.out.println(s);
		//distinct를 썼지만 같은 이름 학생 hong 이 출력됨.   그래서  해시코드랑 이퀄로 재정의 필요.  Student클래스가서 해시코드, 이퀄 오버라이딩 ~~ 하고 실행하면 걸러짐~
		
		
		
	}
}
