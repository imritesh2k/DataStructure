package recursive;

public class RecursiveFactorial {

	public static void main(String[] args) {
		RecursiveFactorial fac = new RecursiveFactorial();
		System.out.println(fac.factorial(3));

	}
	
	public int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return 	n * factorial(n-1);
	}

}
