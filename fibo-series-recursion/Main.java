import java.util.*;

public class Main {
	public static int fibo(int n) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;
		return fibo(n - 1) + fibo(n - 2);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a position");
		int num = in.nextInt();
		int result = Main.fibo(--num);
		System.out.println("Fibonacci number :" + result);

	}

}
