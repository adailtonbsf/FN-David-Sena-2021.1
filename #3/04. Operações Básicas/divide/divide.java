import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class divide {

    static String divide(List<Integer> list, int x) {
		List<Integer> fst = list.stream().limit(x).collect(Collectors.toList());
		List<Integer> snd = list.stream().skip(x).collect(Collectors.toList());
		return "(" + fst.toString() + "," + snd.toString() + ")";
	}

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4);
		
		System.out.println(divide(lista, 0));
		System.out.println(divide(lista, 1));
		System.out.println(divide(lista, 2));
		System.out.println(divide(lista, 3));
		System.out.println(divide(lista, 4));
	}
    
}
