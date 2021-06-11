import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sublist {

    static List<Integer> sublist(int a, int b, List<Integer> list) {
		int begin, end;
		
		if(a < 0) begin = a + list.size();
		else begin = a;
		
		if(b < 0) end = b + list.size();
		else end = b;
		
		return list.stream().limit(end).skip(begin).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
		List<Integer> lista2 = Arrays.asList(0,1,2,3,4,5);
		
		System.out.println(sublist(1, 3, lista1).equals(Arrays.asList(1,2)));
		System.out.println(sublist(0, 11, lista1).equals(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10)));
		System.out.println(sublist(2, 8, lista1).equals(Arrays.asList(2,3,4,5,6,7)));
		System.out.println(sublist(0, -1, lista1).equals(Arrays.asList(0,1,2,3,4,5,6,7,8,9)));
		System.out.println(sublist(2, -2, lista1).equals(Arrays.asList(2,3,4,5,6,7,8)));
		System.out.println(sublist(-10, -1, lista1).equals(Arrays.asList(1,2,3,4,5,6,7,8,9)));
		System.out.println(sublist(-4, -2, lista2).equals(Arrays.asList(2,3)));
	}
    
}
