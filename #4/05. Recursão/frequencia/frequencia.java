import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class frequencia {
	
	static Stream<Integer> __frequencia(int a, List<Integer> xs, int index) {
		if(index < xs.size()) {
			if(xs.get(index) == a) return Stream.concat(Stream.of(1), __frequencia(a, xs, index+1));
			else return Stream.concat(Stream.of(), __frequencia(a, xs, index+1));
		}
		
		return Stream.of();
	}
	
	static int _frequencia(int a, List<Integer> xs) {
		return (int) __frequencia(a, xs, 0).count();
	}

	public static void main(String[] args) {
		System.out.println(_frequencia(1, Arrays.asList()) == 0);
		System.out.println(_frequencia(4, Arrays.asList(4)) == 1);
		System.out.println(_frequencia(4, Arrays.asList(5)) == 0);
		System.out.println(_frequencia(4, Arrays.asList(4,4)) == 2);
		System.out.println(_frequencia(2, Arrays.asList(4,4)) == 0);
		System.out.println(_frequencia(5, Arrays.asList(4,5,2,1,5,5,9)) == 3);
	}

}