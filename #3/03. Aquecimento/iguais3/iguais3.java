public class iguais3 {

    static int iguais(int a, int b, int c) {
		if(a == b && b == c) return 3;
		else if(a == b || b == c || a == c) return 2;
		else return 0;		
	}

	public static void main(String[] args) {
		System.out.println(iguais(2, 2, 2) == 3);
		System.out.println(iguais(2, 2, 3) == 2);
		System.out.println(iguais(2, 3, 2) == 2);
		System.out.println(iguais(2, 1, 1) == 2);
		System.out.println(iguais(3, 2, 1) == 0);
	}
    
}
