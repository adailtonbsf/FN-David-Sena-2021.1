public class max3 {

    static int max3(int a, int b, int c) {
		if(a >= b && a >= c) return a;
		else if(b >= a && b >= c) return b;
		else return c;
	}

	public static void main(String[] args) {
		System.out.println(max3(6, 2, 4) == 6);
		System.out.println(max3(6, 7, 4) == 7);
		System.out.println(max3(6, 7, 9) == 9);
		System.out.println(max3(5, 2, 5) == 5);
	}
    
}
