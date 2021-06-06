import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class uniao {

    static List<Integer> uniao(List<Integer> list1, List<Integer> list2) {
		return Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(4,5);
		List<Integer> lista2 = Arrays.asList(1);
		List<Integer> lista3 = Arrays.asList(4,2,5);
		List<Integer> lista4 = Arrays.asList(1,2,3);
		List<Integer> lista5 = Arrays.asList(2,4,6);
		
		System.out.println(uniao(lista1, lista2).equals(Arrays.asList(4,5,1)));
		System.out.println(uniao(lista1, lista3).equals(Arrays.asList(4,5,2)));
		System.out.println(uniao(lista4, lista5).equals(Arrays.asList(1,2,3,4,6)));
	}
    
}
