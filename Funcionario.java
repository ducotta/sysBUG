
public class Funcionario {
	
	public String nome;
	public String telefone;
	public String endereco;
	public String cpf;
	public String cargo;
	public int senhaFuncionario;

	public Funcionario(String nome, String telefone, String endereco,
			String cpf, String cargo, int senha) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.cargo = cargo;
		this.senhaFuncionario = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getSenha() {
		return senhaFuncionario;
	}
	public void setSenha(int senha) {
		this.senhaFuncionario = senha;
	}
	
	

}
