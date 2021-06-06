import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Final {

    static List<Integer> _final(int x, List<Integer> list){
		if(list.size() > 0) {
			return list.stream().skip(list.size() - x).collect(Collectors.toList());
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList();
        List<Integer> lista2 = Arrays.asList(2,5,4,7,9,6);
        
        System.out.println(_final(3, lista1).equals(Arrays.asList()));
        System.out.println(_final(3, lista2).equals(Arrays.asList(7,9,6)));
        System.out.println(_final(2, lista2).equals(Arrays.asList(9,6)));
        System.out.println(_final(1, lista2).equals(Arrays.asList(6)));

	}
    
}
