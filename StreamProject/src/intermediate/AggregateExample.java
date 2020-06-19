package intermediate;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		int[] intAry = {1,2,3,4,5};
		IntStream iStream = Arrays.stream(intAry);
		OptionalDouble od = iStream.filter(n -> n>5).average();
//		double result = od.getAsDouble(); //창에서는 괜찮지만 컴파일하면 오류가나옴.
//		System.out.println(result); 

		double result;
		
		
		
	//ifPresent 이용 할 수도 있음
		od.ifPresent(new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println("결과는: " + value);
			}
		}); // 결과없으면 나타나지않음
		
		
		
		
	// orElse : 결과값이 없으면 디폴트값 0.0을 출력하겠다
//		result = od.orElse(0.0);  
//		System.out.println(result);
//		
		
		
		
	//여태 보통으로 표현했던거
//		if(od.isPresent()) {
//			result = od.getAsDouble();
//			System.out.println(result);
//		} else
//			System.out.println("값이 없습니다.");
		
	}
}
