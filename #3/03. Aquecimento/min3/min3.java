public class min3 {

    static int min3(int a, int b, int c) {
	    if (a <= b && a <= c) return a;
	    else if (b <= a && b <= c) return b;
	    else return c;
	}

	public static void main(String[] args) {
		System.out.println(min3(1, 2, 3) == 1);
		System.out.println(min3(2, 1, 3) == 1);
		System.out.println(min3(3, 4, 2) == 2);
		System.out.println(min3(2, 5, 4) == 2);
	}
    
}
