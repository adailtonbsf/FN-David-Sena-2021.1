import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intersec {

    static List<Integer> intersec(List<Integer> list1, List<Integer> list2) {
		return list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(3);
		List<Integer> lista2 = Arrays.asList(3,4,1);
		List<Integer> lista3 = Arrays.asList(1,4,3);
		List<Integer> lista4 = Arrays.asList(3,6,5,7);
		List<Integer> lista5 = Arrays.asList(9,7,5,1,3,6);
		List<Integer> lista6 = Arrays.asList(9,7,5,1,3);
		
		System.out.println(intersec(lista1, lista1).equals(Arrays.asList(3)));
		System.out.println(intersec(lista2, lista3).equals(Arrays.asList(3,4,1)));
		System.out.println(intersec(lista4, lista5).equals(Arrays.asList(3,6,5,7)));
		System.out.println(intersec(lista4, lista6).equals(Arrays.asList(3,5,7)));
	}
    
}
