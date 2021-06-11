import java.util.Arrays;
import java.util.List;

public class pertence {

    static boolean pertence(int x, List<Integer> list) {
		return list.contains(x);
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList();
		List<Integer> lista2 = Arrays.asList(3);
		List<Integer> lista3 = Arrays.asList(4);
		List<Integer> lista4 = Arrays.asList(3,7,4,2);
		
		System.out.println(pertence(1, lista1));
		System.out.println(pertence(1, lista2));
		System.out.println(pertence(3, lista3));
		System.out.println(pertence(1, lista4));
		System.out.println(pertence(2, lista4));
		System.out.println(pertence(3, lista4));
		System.out.println(pertence(7, lista4));
	}
    
}
