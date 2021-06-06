public class min2 {

    static int min2(int a, int b) {
		if(a < b) return a;
		else return b;
	}

	public static void main(String[] args) {
		System.out.println(min2(3, 4) == 3);
		System.out.println(min2(4, 1) == 1);
		System.out.println(min2(2, 2) == 2);
		System.out.println(min2(4, -1) == -1);
	}
    
}
