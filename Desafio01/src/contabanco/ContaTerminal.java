package contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Definindo as variáveis:
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número de sua Agéncia: ");
		int numAgencia = sc.nextInt();
		System.out.println("Por favor, digite sua agência: ");
		String agencia = sc.next();
		System.out.println("Por favor, digite o seu nome: ");
		String nome = sc.next();
		System.out.println("Por favor. digite seu saldo: ");
		double saldo = sc.nextDouble();
		
		
		// TODO Imprimindo as variáveis
		System.out.print("Olá " + nome + ",obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numAgencia + " e seu saldo " + saldo + " já está dispovével para saque.");
	}


}
