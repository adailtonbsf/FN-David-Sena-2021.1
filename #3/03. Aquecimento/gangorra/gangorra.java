public class gangorra {

    static int gangorra(int a, int b, int c, int d) {
		if (a * b < c * d) return 1;
		else if (a * b > c * d) return -1;
		else return 0;
	}

	public static void main(String[] args) {
		System.out.println(gangorra(30, 100, 60, 50) == 0);
		System.out.println(gangorra(40, 40, 38, 60) == 1);
		System.out.println(gangorra(35, 80, 35, 75) == -1);
		System.out.println(gangorra(45, 23, 96, 12) == 1);
		System.out.println(gangorra(74, 12, 65, 48) == 1);
		System.out.println(gangorra(78, 45, 12, 23) == -1);
	}
    
}
