package banco;

public class ContaPoupança extends Conta {
	

	public ContaPoupança(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("====Extrato Conta Poupança======");
		super.imprimirInfoComuns();
	}
	
}
