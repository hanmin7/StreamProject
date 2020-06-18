package basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) {
		Path path = Paths.get("c:/program files");
		try {
			Stream<Path> stream = Files.list(path); //파일리스트 가져옴. 없을수도있어서 트라이캐치
			stream.forEach((t) -> System.out.println(t.getFileName()));
//			stream.forEach(new Consumer<Path>() {
//				@Override
//				public void accept(Path t) {
//					System.out.println(t.getFileName());
//				}
//			});
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//file  파일 읽어오는거
//		path = Paths.get("src/basic/FromDirectoryExample.java"); 
		path = Paths.get(".project"); //d/Dev/workspace/Streamproject 하위..root 디렉토리/
		try {
			Stream<String> strStream = Files.lines(path);
//			strStream.forEach(t -> System.out.println(t.toString()));
//			strStream.forEach(t -> System.out.println(t));
			strStream.forEach(System.out::println); // t -> System.out.println(t) 더 간결하게
			strStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
