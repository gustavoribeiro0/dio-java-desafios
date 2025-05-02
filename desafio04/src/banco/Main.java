package banco;

public class Main {

	public static void main(String[] args) {
		Cliente gustavo = new Cliente("Gustavo", "Brasília", "Básico");
		Cliente joao = new Cliente("João", "Rio de janeiro", "Senior");
		
		Conta cc = new ContaCorrente(gustavo);
		Conta poupança = new ContaPoupança(joao);
		
		cc.depositar(200);
		poupança.depositar(500);
		poupança.tranferir(200, cc);
		cc.sacar(120);
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();
		
		gustavo.imprimirInfoCliente();
		joao.imprimirInfoCliente();
	}

}
