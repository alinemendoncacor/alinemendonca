import java.util.Scanner;
public class CalculaIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);  //cria��o do scanner de nome in, ser� usado para ler os valores
		int anoAtual, anoNasc, idade;
		
		System.out.println("Entre com o ano atual: "); //pede pro usu�rio digitar o ano atual
		anoAtual = ler.nextInt();						//faz a leitura do ano atual e guarda na variavel anoAtual
		System.out.println("Entre com o ano de nascimento"); //pede pro usuario digitar o ano de nascimento
		anoNasc = ler.nextInt();					//faz a leitura do ano de nascimento e guarda na variavel anoNasc
		
		//Calculo da idade
		idade = anoAtual - anoNasc;
		
		//Apresentando a idade
		
		System.out.println("Sua idade � "+idade+" anos");
		ler.close();
	}

}


