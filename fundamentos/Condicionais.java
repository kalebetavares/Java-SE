package fundamentos;

public class Condicionais {

	public static void main(String[] args) {
	System.out.println("Exemplo 1 - Uso do 'if': ");
	char sexo = 'M';
	if (sexo == 'M') {
		System.out.println("Alistamento militar obrigatório");
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
		System.out.println("VOTO OBRIGATÓRIO");
	}
	else {
		System.out.println("VOTO FACULTATIVO");
	}
	
	System.out.println("");
	System.out.println("Exemplo 4 - Uso do 'Switch case': ");
	System.out.println("1. Cadastro de clientes");
	System.out.println("2. Cadastro de usuários");
	System.out.println("3. Relatórios");
	
	int opcao = 1;
	
	switch (opcao) {
	case 1:
		System.out.println("CLIENTES");
		break;
	case 2:
		System.out.println("USUÁRIOS");
		break;
	case 3:
		System.out.println("RELATÓRIOS");
		break;
	default:
		System.out.println("Opção inválida");
		break;
		}
	
	}
}
