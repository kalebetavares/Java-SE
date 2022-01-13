package fundamentos;

public class Repeticoes {

	public static void main(String[] args) {
		System.out.println("Estruturas de repetições: ");
		System.out.println("");
		System.out.println("Exemplo 5 - Uso do 'for'");
		System.out.println("");

		for(int j = 10; j > 0; j--) {
			System.out.println("J: " + j);
		}
		
		System.out.println("Exemplo 6 - Tabuada");
		System.out.println("");
		
		for (int tabuada = 0 ; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <=10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}
		
		System.out.println("Exemplo 7 - Uso da estrutura 'while'");
		System.out.println("");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("Exemplo 8 - Uso da estrutura 'do while'");
		System.out.println("");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente(s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GAME OVER");

	}

}
