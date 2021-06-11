import java.util.stream.IntStream;

public class euler1 {

    static int euler1(int a) {
		return IntStream.rangeClosed(1, a-1)
				.filter(x -> x % 3 == 0 || x % 5 == 0)
				.sum();
	}
	
	public static void main(String[] args) {
		System.out.println(euler1(3));
		System.out.println(euler1(4));
		System.out.println(euler1(5));
		System.out.println(euler1(6));
		System.out.println(euler1(10));
		System.out.println(euler1(1000));
	}
    
}
