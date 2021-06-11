import java.util.Arrays;
import java.util.List;

public class elemento {

    static int elemento(int x, List<Integer> list) {
		if(x < 0) return list.get(x+list.size());
		else return list.get(x);
	}

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(2,7,3,9);
		
		System.out.println(elemento(2, lista) == 3);
		System.out.println(elemento(0, lista) == 2);
		System.out.println(elemento(-1, lista) == 9);
		System.out.println(elemento(-2, lista) == 3);
	}
    
}
