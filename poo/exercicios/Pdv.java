package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pdv {

	public static void main(String[] args) {
		//Variáveis
		double ValorTotal, Desconto,TotalDesc, ValorPago, Troco;
		
		//Objetos
		DecimalFormat formatador = new DecimalFormat("#0.00");
		Scanner entrada = new Scanner(System.in);
		
		//Entrada 1
		System.out.println("Digite o valor total da compra: ");
		ValorTotal = entrada.nextDouble();
		
		System.out.println("Digite o valor do desconto: ");
		Desconto = entrada.nextDouble();
		
		
		//Saída 1
		TotalDesc = ValorTotal - (ValorTotal * Desconto)/100;
		System.out.println("Total com desconto: R$ " + TotalDesc);
		
		//Entrada 2
		System.out.println("Digite o valor pago: ");
		ValorPago = entrada.nextDouble();
		
		//Processamento
		Troco = ValorPago - TotalDesc;
		
		//Saída 2
		System.out.println("Valor total: R$ " + formatador.format(ValorTotal));
		System.out.println("Desconto: " + Desconto + "%");
		System.out.println("Valor pago: R$ " + formatador.format(ValorPago));
		System.out.println("Troco: R$ " + Troco);
		
		entrada.close();
	}

}
