
public class Conta extends SysBUG{
	
	private int numero;
	private int operacao;
	private String tipo;
	private Double saldo;
	
	public Conta(int numero, int operacao) {
		super();
		this.numero = numero;
		this.operacao = operacao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String toString(){
		return "Operacao " + operacao + "/tNumero " + numero + "/tSaldo " + saldo; 
	}
	
}
