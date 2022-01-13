package fundamentos;

public class Condicionais {

	public static void main(String[] args) {
	System.out.println("Exemplo 1 - Uso do 'if': ");
	char sexo = 'M';
	if (sexo == 'M') {
		System.out.println("Alistamento militar obrigat�rio");
		}
	System.out.println("");
	System.out.println("Exemplo 2 - Uso do 'if - else': ");
	int idade = 71;
	if (idade < 18) {
		System.out.println("Menor de idade");
		}
	else {
		System.out.println("Maior de idade");
		}
	System.out.println("");
	System.out.println("Exemplo 3 - Uso do 'else if': ");
	
	if(idade < 16) {
		System.out.println("PROIBIDO VOTAR");
	}
	else if (idade >= 18 && idade <= 70) {
		System.out.println("VOTO OBRIGAT�RIO");
	}
	else {
		System.out.println("VOTO FACULTATIVO");
	}
	
	System.out.println("");
	System.out.println("Exemplo 4 - Uso do 'Switch case': ");
	System.out.println("1. Cadastro de clientes");
	System.out.println("2. Cadastro de usu�rios");
	System.out.println("3. Relat�rios");
	
	int opcao = 1;
	
	switch (opcao) {
	case 1:
		System.out.println("CLIENTES");
		break;
	case 2:
		System.out.println("USU�RIOS");
		break;
	case 3:
		System.out.println("RELAT�RIOS");
		break;
	default:
		System.out.println("Op��o inv�lida");
		break;
		}
	
	}
}
