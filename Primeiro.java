import java.util.*;
public class Primeiro {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random rand= new Random();
		int v[] = new int [10];
		int i,j,primo=0;
		for(i=0;i<v.length;i++) {
			v[i]=rand.nextInt(64);
		}
		for (i=0; i<v.length; i++) {
			if (isPrime(v[i])) {
				System.out.println(v[i]+" É primo");
			}
			else {
				System.out.println(v[i]+" Não é primo");
			}
		}

	}
	public static boolean isPrime (int n) {
		int i =0, j=0;
		boolean isprime=false;
		
		for (i=1; i<=n; i++) {
			if (n%i==0) j++;
		}
		if (j==2) isprime = true;
		else isprime = false;
		return isprime;
	}

}
