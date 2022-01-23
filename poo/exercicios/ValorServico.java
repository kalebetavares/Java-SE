package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		//Vari�veis
		double hora, remuneracao, custo, cargaHoraria;
		//Objetos
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//Entradas
		System.out.println("Digite o valor da sua remunera��o: ");
		remuneracao = entrada.nextDouble();
		System.out.println("Digite o valor do seu custo operacional: ");
		custo = entrada.nextDouble();
		System.out.println("Digite sua carga hor�ria: ");
		cargaHoraria = entrada.nextDouble();
		//Processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		//Sa�da
		System.out.println("O valor da sua hora �: " + formatador.format(hora));
		entrada.close();
	}

}
