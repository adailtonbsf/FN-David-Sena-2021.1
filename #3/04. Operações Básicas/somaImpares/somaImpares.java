import java.util.Arrays;
import java.util.List;

public class somaImpares {

    static int somaImpares(List<Integer> list) {
		return list.stream()
				.filter(x -> x % 2 != 0)
				.mapToInt(Integer::valueOf).sum();
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(2,3,1,5);
		List<Integer> lista2 = Arrays.asList(1,1,4,2);
		List<Integer> lista3 = Arrays.asList(3,2,4,6,5,7,8,0,1);
		List<Integer> lista4 = Arrays.asList(2,3,1,5,2,2);
		List<Integer> lista5 = Arrays.asList(1,1,1,1);
		
		System.out.println(somaImpares(lista1) == 9);
		System.out.println(somaImpares(lista2) == 2);
		System.out.println(somaImpares(lista3) == 16);
		System.out.println(somaImpares(lista4) == 9);
		System.out.println(somaImpares(lista5) == 4);
	}
    
}
