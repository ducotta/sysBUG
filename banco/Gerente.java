package banco;

public class Gerente extends Funcionario {
	
	public int numeroDeFuncionariosGerenciados;

	public Gerente(String nome, String telefone, String endereco, String cpf,
			String cargo, int senha, int numeroDeFuncionariosGerenciados) {
		super(nome, telefone, endereco, cpf, cargo, senha);
		
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(
			int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	
}
