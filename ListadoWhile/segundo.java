import java.util.*;
import java.util.Scanner;
public class segundo {
	public static void main(String[]args) {
		int u=0,m=0, d=0, v=0 ;
		Scanner ler = new Scanner(System.in);
		Random rand=new Random();
		System.out.println("0=Tesoura | 1=Pedra | 2=Papel");
		for(int i=0;i<3;i++) {
			u = ler.nextInt();
			m = rand.nextInt(3);
			System.out.println("A máquina escolheu " + m);
			switch(m) {
			case 0: 
				switch(u) {
				case 0:
					System.out.println("Empate");
					break;
				case 1:
					System.out.println("Você Ganhou!");
					v++;
					break;
				case 2:
					System.out.println("Você Perdeu!");
					d++;
					break;
				}
				break;
			case 1: 
				switch(u) {
				case 0:
					System.out.println("Você Perdeu!");
					d++;
					break;
				case 1:
					System.out.println("Empate");
					break;
				case 2:
					System.out.println("Você ganhou!");
					v++;
					break;
				}
				break;
			case 2: 
				switch(u) {
				case 0:
					System.out.println("Você Ganhou!");
					v++;
					break;
				case 1:
					System.out.println("Você Perdeu!");
					d++;
					break;
				case 2:
					System.out.println("Empate");
					break;
				}
				break;
			}
			
		
	}
		
		if(v > d) {
			System.out.println(" \nVocê ganhou da maquina");
		}
		else if(d > v) {
			System.out.println(" \nVocê perdeu para a maquina");
		}
		else {
			System.out.println(" \nO jogo empatou");
		}
}
}
