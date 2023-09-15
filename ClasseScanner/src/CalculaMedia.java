import java.util.Scanner; //importando a classe scanner para dentro do codigo
public class CalculaMedia {
	public static void main(String[] args) {
		//criar o objeto da classe Scanner
		Scanner ler = new Scanner(System.in);
		double n1, n2, m;
		String nome;
		System.out.println("Digite seu nome:");
		nome = ler.next();
		System.out.print("Entre com a 1a nota:");
		n1 = ler.nextDouble();
		System.out.print("Entre com a 2a nota:");
		n2 = ler.nextDouble();
		m = (n1+n2)/2;
		System.out.println(nome+" sua média é "+m);
		ler.close();
	}
}
