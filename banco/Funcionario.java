package banco;

public class Funcionario {
	
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	private String cargo;
	private int senhaFuncionario;

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
	
	public void autenticaSenha(int senha){
		if(senhaFuncionario == senha){
			System.out.println("Acesso Permitido");
		}else{
			System.out.println("Acesso negado!");
		}
	}
	

}
