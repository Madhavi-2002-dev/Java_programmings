package methods;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(3,4,6,22,33,88);
		/*
		 * Predicate<Integer>evenNumberPredicate=number->number%2==0;
		 * numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::
		 * println);
		 */
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
	}
	public static boolean isEven(Integer numbers)
	{
		return numbers%2==0;
	}

}
