package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamExample {
	static int sum = 0;
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
		for(int n : numbers) {
			if(n %2 == 1) { //홀수만 가져올꺼임
				int square = n * n; //그 제곱값을 sum에 넣을꺼임
				sum += square;
			}
		}
		System.out.println("결과: " + sum);
	
//		numbers.stream().forEach(s -> System.out.println(s)); //stream의 값을 출력해봄.
		
//		Predicate<Integer> predicate = new Predicate<Integer>() { //predicate가 함수.... 람다로 나타낼 수 있음
//			@Override
//			public boolean test(Integer t) {
//				return t%2 == 1; //t로 나눈 나머지가 1인지 여부를 리턴
//			}
//		};
		
		Predicate<Integer> predicate = (t) -> t % 2 == 1; //람다식
		
//		numbers.stream().filter(predicate).forEach(s -> System.out.println(s)); //stream의 값을 출력해봄.

		Function<Integer, Integer> function = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
			
		};
//		numbers.stream().filter((t) -> t % 2 == 1).map(function).forEach(s -> System.out.println(s));
		
//		numbers.stream().filter((t) -> t % 2 == 1).map(function).forEach(s -> sum += s); //sum

		numbers.stream().filter((t) -> t % 2 == 1).map(t -> t * t).forEach(s -> sum += s); 
		//predicate, function 람다식으로.그럼 위에거 필요X 주석채워도됨ㅇㅇ .  이렇게 stream 이용해서  나타내는 표현 연습해볼꺼임....
		
		System.out.println("결과: " + sum);
	
	}
}
