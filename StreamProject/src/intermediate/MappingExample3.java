package intermediate;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample3 {
	public static void main(String[] args) {
		int[] intAry = {1,2,3,4,5};
		double[] doubleAry = {1.1, 2.3, 3.5, 4.2, 5.5};
		
		IntStream intStream = Arrays.stream(intAry);
		DoubleStream doubleStream = Arrays.stream(doubleAry);
		
		doubleStream = intStream.asDoubleStream(); //intStream을 doubleStream 으로 출력하겠다 ->1.0, 2.0 이렇게 나옴
		doubleStream.forEach(s -> System.out.println(s));
		
		intStream = Arrays.stream(intAry);
		intStream.asLongStream().forEach(System.out::println);
		Stream<Integer> iStream = intStream.boxed(); //wrapper 같은 느낌
		iStream.forEach(s -> System.out.println(s));
		
		
		//여기까지 중간처리 메소드들.. 했음~
	}
}
