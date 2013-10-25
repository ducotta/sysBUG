
public class Cliente {

	private int senha;
	private String nome;
	private String email;
	private String endereco;
	
	
	public Cliente(int senha, String nome, String endereco) {
		this.senha = senha;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
