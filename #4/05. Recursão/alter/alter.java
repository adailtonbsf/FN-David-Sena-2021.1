import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class alter {
	
	static Stream<Integer> __alter(int a, int b) {
		if(a <= b) return Stream.concat(Stream.of(a, -a), __alter(a+1, b));
		else return Stream.of();
	}
	
	static List<Integer> _alter(int a) {
		if(a <= 0) return Arrays.asList();
		else return __alter(1, a).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(_alter(1).equals(Arrays.asList(1,-1)));
		System.out.println(_alter(2).equals(Arrays.asList(1,-1,2,-2)));
		System.out.println(_alter(4).equals(Arrays.asList(1,-1,2,-2,3,-3,4,-4)));
	}

}