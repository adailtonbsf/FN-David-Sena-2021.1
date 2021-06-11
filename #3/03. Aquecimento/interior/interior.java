import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class interior {
    
    static List<Integer> interior(List<Integer> list) {
		return list.stream()
				.limit(list.size()-1)
				.skip(1)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(1,2);
		List<Integer> lista2 = Arrays.asList(1,3,2);
		List<Integer> lista3 = Arrays.asList(2,5,3,7,3);
		List<Integer> lista4 = Arrays.asList(2,2,2,4);
		List<Integer> lista5 = Arrays.asList(1,2,3,5,7,8);
		
		System.out.println(interior(lista1).equals(Arrays.asList()));
        System.out.println(interior(lista2).equals(Arrays.asList(3)));
        System.out.println(interior(lista3).equals(Arrays.asList(5,3,7)));
        System.out.println(interior(lista4).equals(Arrays.asList(2,2)));
        System.out.println(interior(lista5).equals(Arrays.asList(2,3,5,7)));
	}

}
