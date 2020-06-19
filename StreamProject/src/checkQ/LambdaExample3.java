package checkQ;

import java.util.function.UnaryOperator;

public class LambdaExample3 {
	public static void main(String[] args) {
		
		UnaryOperator<String> uo = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
//				return t.substring(t.length()-3); //전체길이에서 -3한 수 자릿수부터 나타냄.  안에 들어간 수가 잘려서 뒤에남은거만 출력됨.
				return t.toLowerCase(); //소문자로 리턴
			}
		};
		
		System.out.println(uo.apply("HelloWorldNice"));
	}
}
