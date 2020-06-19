package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample2 {
	public static void main(String[] args) {
//		List<Employee> employees = Employee.persons();
//		employees.stream().map(new Function<Employee, String>() {
//			@Override
//			public String apply(Employee t) {
//				return t.getName();
//			}
//		}).filter(new Predicate<String>() {
//			@Override
//			public boolean test(String t) {
//				return t.startsWith("H");
//			}
//		}).forEach(s -> System.out.println(s));

		// 람다식
		List<Employee> employees = Employee.persons();

//		employees.stream().map(t-> t.getName()).filter(t -> t.startsWith("H")).forEach(s -> System.out.println(s));

		
//		employees.stream().map(new Function<Employee, String>() { //map : employee->string 으로
//			@Override
//			public String apply(Employee t) {
//				return t.getName();
//			}
//		}).flatMap(new Function<String, Stream<Character>>() { //flatmap : string -> character Stream으로
//			@Override
//			public Stream<Character> apply(String t) { 
//				return IntStream.range(0, t.length()) //length 길이 만큼의 int타입 스트림 생성 Hong -> h,o,n 까지 (마지막포함x 무슨 close어쩌구해야지 끝에꺼 까지포함)
//					.mapToObj(new IntFunction<Character>() {
//						@Override
//						public Character apply(int value) { //위에서 만들었는 0,1,2  인트받아서 캐릭터타입으로 
//							return t.charAt(value); 
//						}
//				});
//			}
//		}).forEach(s -> System.out.println(s));
		
		
		
//		employees.stream().map(t -> t.getName())
//		.flatMap(t -> IntStream.range(0, t.length())
//					.mapToObj(value -> t.charAt(value))
//		.forEach(s -> System.out.println(s));
		//줄이는거 왜 에러가 나지....
		
		
		
		
		employees.stream().map(new Function<Employee, String>() {
			@Override
			public String apply(Employee t) {
				return t.getName();
			}
		}).peek(s -> System.out.println("peek " + s))
		.flatMap(new Function<String, Stream<Character>>() { 
			@Override
			public Stream<Character> apply(String t) { 
				return IntStream.range(0, t.length())
					.mapToObj(new IntFunction<Character>() {
						@Override
						public Character apply(int value) {
							return t.charAt(value); 
						}
				});
			}
		}).forEach(s -> System.out.println("foreach " + s));
		
		
		
	}
}
