package banco;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numero;
	private double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.numero = SEQUENCIAL++;
		this.agencia = AGENCIA_PADRAO;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void tranferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("");
		
	}
	
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número Conta: %d", this.numero));
		System.out.println(String.format("Saldo da Conta: %2f", this.saldo));
	}
	
}
