package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		//vari�veis
		double f, c;
		//Objetos
		Scanner temperatura = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat ("#0.0");
		//Entrada
		System.out.println("Digite a temperatura em Fahrenheit: ");
		f = temperatura.nextDouble();
		//Processamento
		c = (5*(f-32))/9;
		//sa�da
		System.out.println("A temperatura �: " + formatador.format(c) + " �C");
		temperatura.close();
	}

}
