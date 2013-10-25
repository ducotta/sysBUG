
public class PessoaFisica extends Cliente{

	private String cpf;

	public PessoaFisica(int senha, String nome, String endereco, String cpf) {
		super(senha, nome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
