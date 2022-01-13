package fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		double i = 10;
		System.out.println("Operadores Aritméticos e Atribuições");
		System.out.println("Exemplos:");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("-----------------------------------------------");
		System.out.println(" i += 5 | i = " + (i += 5));
		System.out.println(" i -= 5 | i = " + (i -= 5));
		System.out.println(" i *= 5 | i = " + (i *= 5));
		System.out.println(" i /= 5 | i = " + (i /= 5));
		System.out.println("-----------------------------------------------");
		i++;
		System.out.println("i++   | i = " + i);
		i--;
		System.out.println("i--   | i = " + i);
	}

}
