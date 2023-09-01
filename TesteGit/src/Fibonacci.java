
public class Fibonacci {
	static long fibo(int n) {
		if (n<2) {
			return n;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}
	
	public static void main(String[] args) {
		int i=1;
		while (i<=20) {
			System.out.println(Fibonacci.fibo(i)+"\t");
			i++;
		}
	}
}

