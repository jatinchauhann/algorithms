import java.util.Scanner;

public class Main {
	static int[] mem;
	static int size;

	Main(int size) {
		mem = new int[size + 1];
	}

	public int fibo(int n, int[] memo) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;
		if (memo[n] == 0)
			memo[n] = fibo(n - 1, memo) + fibo(n - 2, memo);
		return memo[n];

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a position");
		int num = in.nextInt();num--;
		Main obj = new Main(num);
		int result = obj.fibo(num , mem);
		System.out.println("Fibonacci number :" + result);

	}

}
