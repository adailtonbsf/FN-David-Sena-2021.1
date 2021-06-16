public class fibonacci {
	
	static int fib(int a) {
		if(a == 0) return 0;
		else if (a == 1) return 1;
		else return fib(a-1) + fib(a-2);
	}

	public static void main(String[] args) {
		System.out.println(fib(0) == 0);
		System.out.println(fib(1) == 1);
		System.out.println(fib(2) == 1);
		System.out.println(fib(3) == 2);
		System.out.println(fib(4) == 3);
		System.out.println(fib(5) == 5);
		System.out.println(fib(6) == 8);
		System.out.println(fib(7) == 13);
	}

}