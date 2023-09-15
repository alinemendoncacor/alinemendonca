import java.util.Scanner;
public class MaiorMenor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, id, maior=0, menor=0;
		while(i<11) {
			System.out.println("Entre com a idade do "+i+"o. usuario");
			id = in.nextInt();
			if (id>=18) {
				maior++;
			}else {
				menor++;
			}
			i++;
		}
		System.out.println("Maiores = "+maior+"\nMenores="+menor);
	}
}
