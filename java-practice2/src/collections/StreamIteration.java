package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIteration {

	public static void main(String[] args) {
		
		List<Integer> fib = new LinkedList<Integer>();
		
		//Lambda Expression: code as data, express instances of functional interfaces(with single abstract method)
		fib = Stream.iterate(new int[] {0, 1}, t -> new int[]{t[1], t[0]+t[1]})
				.limit(10)
				.map(n->n[0])
				.collect(Collectors.toList());
		fib.forEach(x->System.out.println(x));
	}

}
