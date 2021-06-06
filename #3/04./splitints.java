import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class splitints {

    static String splitints(List<Integer> list) {
		List<Integer> impares = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		List<Integer> pares = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		return "(" + impares.toString() + "," + pares.toString() + ")";
	}

	public static void main(String[] args) {
		System.out.println(splitints(Arrays.asList(1,2,3,4,5,6,7)));
		System.out.println(splitints(Arrays.asList(2,4,6,1,1,7)));
	}
    
}
