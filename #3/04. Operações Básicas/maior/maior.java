import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maior {

    static int maior(List<Integer> list) {
		return list.stream().sorted(Collections.reverseOrder()).findFirst().get();
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(4);
		List<Integer> lista2 = Arrays.asList(5,1);
		List<Integer> lista3 = Arrays.asList(5,7);
		List<Integer> lista4 = Arrays.asList(1,2,7,1,5);
		List<Integer> lista5 = Arrays.asList(1,2,3,1,5);
		
		System.out.println(maior(lista1) == 4);
		System.out.println(maior(lista2) == 5);
		System.out.println(maior(lista3) == 7);
		System.out.println(maior(lista4) == 7);
		System.out.println(maior(lista5) == 5);
	}
    
}
