import java.util.stream.IntStream;

public class fatorial {

    static int fatorial(int x) {
		return IntStream.rangeClosed(1, x).reduce(1, (a,b) -> a * b);
	}

	public static void main(String[] args) {
		System.out.println(fatorial(0) == 1);
		System.out.println(fatorial(1) == 1);
		System.out.println(fatorial(5) == 120);
	}
    
}
