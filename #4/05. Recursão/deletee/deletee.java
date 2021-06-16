import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class deletee {
	
	static List<Integer> _deletee(int a, List<Integer> xs) {
		return Stream.concat(xs.stream().takeWhile(x -> x != a), xs.stream().dropWhile(x -> x != a).skip(1))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(_deletee(5, Arrays.asList()).equals(Arrays.asList()));
		System.out.println(_deletee(1, Arrays.asList(1)).equals(Arrays.asList()));
		System.out.println(_deletee(4, Arrays.asList(1,3,4)).equals(Arrays.asList(1,3)));
		System.out.println(_deletee(3, Arrays.asList(4,3,1,3)).equals(Arrays.asList(4,1,3)));
		System.out.println(_deletee(5, Arrays.asList(1,5,6,9)).equals(Arrays.asList(1,6,9)));
	}

}