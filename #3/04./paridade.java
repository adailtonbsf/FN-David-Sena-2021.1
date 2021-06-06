import java.util.Arrays;
import java.util.List;

public class paridade {

    static boolean paridade(List<Boolean> list) {
		if(list.stream().filter(x -> x.booleanValue()).count() % 2 == 0) return false;
		else return true;
	}

	public static void main(String[] args) {
		System.out.println(paridade(Arrays.asList()) == false);
		System.out.println(paridade(Arrays.asList(true, true, false)) == false);
		System.out.println(paridade(Arrays.asList(true,false,true,false,true)) == true);
		System.out.println(paridade(Arrays.asList(false, true, false)) == true);
	}
    
}
