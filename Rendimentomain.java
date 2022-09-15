package br.com.rendimento;
import java.util.Scanner;
public class Rendimentomain {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor inicial do investimento");
		double vrInicial = ler.nextDouble();
		
		System.out.println("Digite a taxa de juros: ");
		double txJuros = ler.nextDouble();
		
		System.out.println("Digite o numero de meses para o Rendimento");
		int numMeses=ler.nextInt();
		
		Rendimento r1 = new Rendimento(vrInicial,txJuros, numMeses);
		r1.calculaRendimento();
		
	}

}
