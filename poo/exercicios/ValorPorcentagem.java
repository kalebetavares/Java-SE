package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorPorcentagem {

	public static void main(String[] args) {
		//variáveis
		double x, y , valor;
		//entrada
		DecimalFormat formatador = new DecimalFormat("#0.00");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número: ");
		y = entrada.nextDouble();
		
		
		System.out.println("Digite a porcentagem a ser calculada: ");
		x = entrada.nextDouble();
		//processamento
		valor = y * (x/100);
		//saída
		System.out.println("Valor: " + formatador.format(valor));
		
		entrada.close();
	}

}
