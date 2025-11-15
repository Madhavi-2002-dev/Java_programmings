package methods;

public class StringApiMethods {
	public static void main(String[] args) {
		System.out.println( " ".isBlank());
		System.out.println(" LR ".strip().replace(" ", "@"));
		System.out.println(" LR ".stripLeading().replace(" ", "@"));
		System.out.println(" LR ".stripTrailing().replace(" ", "@"));
		"Hello\nworld\njava".lines().forEach(System.out::println);
		
		System.out.println("UPPER".transform(s->s.substring(3)));
		
		System.out.println("my name is %s. my age is %d.".formatted("madhavi",23));
	}

}
