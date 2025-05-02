package banco;

public class Cliente {
	/*Alteração Codigo Desafio*/
	
	private String nome;
	private String cidadeAgencia;
	private String classeCliente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidadeAgencia() {
		return cidadeAgencia;
	}
	public void setCidadeAgencia(String cidadeAgencia) {
		this.cidadeAgencia = cidadeAgencia;
	}
	public String getClasseCliente() {
		return classeCliente;
	}
	public void setClasseCliente(String classeCliente) {
		this.classeCliente = classeCliente;
	}
	
	public Cliente(String nome, String cidadeAgencia, String classeCliente) {
		this.nome = nome;
		this.cidadeAgencia = cidadeAgencia;
		this.classeCliente = classeCliente;
	}
	
	public void imprimirInfoCliente() {
		System.out.println(String.format("\nNome: %s", this.nome));
		System.out.println(String.format("Sua Agência %s", this.cidadeAgencia));
		System.out.println(String.format("Sua Classe: %s", this.classeCliente));
	}
	
}
