package banco;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	private String razaoSocial;

	public PessoaJuridica(int senha, String nome, String endereco, String cnpj) {
		super(senha, nome, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
}
