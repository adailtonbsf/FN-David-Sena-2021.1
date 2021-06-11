import java.util.Arrays;
import java.util.List;

public class total {

    static int total(List<Integer> list) {
		return (int) list.stream().count();
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList();
		List<Integer> lista2 = Arrays.asList(1);
		List<Integer> lista3 = Arrays.asList(2,3);
		List<Integer> lista4 = Arrays.asList(3,2,1);
		
		System.out.println(total(lista1) == 0);
		System.out.println(total(lista2) == 1);
		System.out.println(total(lista3) == 2);
		System.out.println(total(lista4) == 3);
	}
    
}
