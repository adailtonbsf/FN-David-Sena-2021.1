import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class corpo {

    static List<Integer> corpo(List<Integer> list) {
		return list.stream().limit(list.size()-1).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(1);
		List<Integer> lista2 = Arrays.asList(1,2);
		List<Integer> lista3 = Arrays.asList(1,2,3,4);
		
		System.out.println(corpo(lista1).equals(Arrays.asList()));
		System.out.println(corpo(lista2).equals(Arrays.asList(1)));
		System.out.println(corpo(lista3).equals(Arrays.asList(1,2,3)));
	}
    
}
