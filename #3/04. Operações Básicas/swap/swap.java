import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class swap {

    static List<Integer> swap(List<Integer> list, int a, int b) {
		if(a < 0 || b > list.size()) return list;
		else {
			Stream<Integer> esquerda = list.stream().limit(a);
			Stream<Integer> elemento_i = Stream.of(list.get(a));
			Stream<Integer> meio = list.stream().skip(a+1).limit(b - (a+1));
			Stream<Integer> elemento_j = Stream.of(list.get(b));
			Stream<Integer> direita = list.stream().skip(b+1);
			
			return Stream.concat(esquerda, 
					Stream.concat(elemento_j, 
							Stream.concat(meio, 
									Stream.concat(elemento_i, direita)))).collect(Collectors.toList());
		}
	}

	public static void main(String[] args) {
		System.out.println(swap(Arrays.asList(), 0, 5).equals(Arrays.asList()));
		System.out.println(swap(Arrays.asList(1), 0, 3).equals(Arrays.asList(1)));
		System.out.println(swap(Arrays.asList(1,3,4), 1, 2).equals(Arrays.asList(1,4,3)));
		System.out.println(swap(Arrays.asList(1,2,3,4,5,6), 2, 5).equals(Arrays.asList(1,2,6,4,5,3)));
		System.out.println(swap(Arrays.asList(5,6,7,8,9), 0, 3).equals(Arrays.asList(8,6,7,5,9)));
	}

    
}
