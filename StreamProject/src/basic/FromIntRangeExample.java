package basic;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
//		IntStream stream = IntStream.range(11, 20); //스타트는 포함 엔드인트는 포함안됨.
		IntStream stream = IntStream.rangeClosed(11, 20); //스타트, 엔드 인트 다 포함.
		
		IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value%2 == 1;
			}
		};
//		stream.filter(predicate).forEach(s -> System.out.println(s));
		
		
		
		//랜덤숫자 가져오는거
		Random random = new Random();
		IntStream intStream = random.ints(10, 11, 100); //몇개가져올꺼냐(사이즈), 시작 수, 끝 수
//		IntStream intStream = random.ints(20, 50, 59); //중복이 생기네
		
//		IntStream intStream = random.ints(20, 11, 100);
//		IntPredicate predicate1 = new IntPredicate() {
//			@Override
//			public boolean test(int t) {
//				return t <60;
//			}
//		};
//		intStream.filter(predicate1).forEach(s -> System.out.println(s));
		//t>50 도 만들어야함.
		
//		intStream.filter(t-> t>50).filter(v-> v<60).forEach(s -> System.out.println(s));
		intStream.filter(a-> a>=50 && a <60).forEach(s -> System.out.println(s));
		
		
		
	}
}
