package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lamda", "stream mapping");
		
		//---
		Stream<String> stream = inputList1.stream();
		stream.flatMap(new Function<String, Stream<String>>() {
			@Override
			public Stream<String> apply(String t) {
				String[] strAry = t.split(" ");
				return Arrays.stream(strAry);
			}
		}).forEach(System.out::println);
		//---
		
		
//		inputList1.stream()	
//			.flatMap(data -> Arrays.stream(data.split(" ")))
//			.forEach(word -> System.out.println(word));
//		System.out.println();
		
		
		
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		
		//---
		inputList2.stream().flatMapToInt(new Function<String, IntStream>() {
			@Override
			public IntStream apply(String t) {
				String[] strAry = t.split(",");
				int[] intAry = new int[strAry.length];
				for(int i =0; i<strAry.length; i++) {
					intAry[i] = Integer.parseInt(strAry[i]);
				}
				return Arrays.stream(intAry);
			}
		})
//		.forEach(System.out::println); //완전 줄인거.  풀어쓴게 아래
		//---
		
//		.forEach(new IntConsumer() {
//			@Override
//			public void accept(int value) {
//				System.out.println(value);
//			}
//		});
		.forEach((s) -> System.out.println(s));
		
		
		
//		inputList2.stream()
//			.flatMapToInt(data -> {
//				String[] strArr = data.split(",");
//				int[] intArr = new int[strArr.length];
//				for(int i=0; i<strArr.length; i++) {
//					intArr[i] = Integer.parseInt(strArr[i].trim());
//				}
//				
//				return Arrays.stream(intArr);
//			})
//			.forEach(number -> System.out.println(number));
		
	}
}
