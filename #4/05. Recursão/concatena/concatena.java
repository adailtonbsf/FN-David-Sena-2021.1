import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class concatena {
	
	static List<Integer> _concatena(List<Integer> a, List<Integer> b) {
		return Stream.concat(a.stream(), b.stream()).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList();
		List<Integer> lista2 = Arrays.asList(1,2);
		List<Integer> lista3 = Arrays.asList(1,2,3);
		List<Integer> lista4 = Arrays.asList(3,4);
		
		System.out.println(_concatena(lista1, lista1).equals(Arrays.asList()));
		System.out.println(_concatena(lista1, lista4).equals(Arrays.asList(3,4)));
		System.out.println(_concatena(lista2, lista1).equals(Arrays.asList(1,2)));
		System.out.println(_concatena(lista2, lista4).equals(Arrays.asList(1,2,3,4)));
		System.out.println(_concatena(lista3, lista4).equals(Arrays.asList(1,2,3,3,4)));
	}

}