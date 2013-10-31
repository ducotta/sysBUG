package banco;

public class Presidente extends Funcionario {
	
	private int numeroDeFuncionariosComandados;
	private double lucroDoBanco;
	
	public Presidente(String nome, String telefone, String endereco,
			String cpf, String cargo, int senha,
			int numeroDeFuncionariosComandados) {
		super(nome, telefone, endereco, cpf, cargo, senha);
		this.numeroDeFuncionariosComandados = numeroDeFuncionariosComandados;
	}
	
	public int getNumeroDeFuncionariosComandados() {
		return numeroDeFuncionariosComandados;
	}


	public void setNumeroDeFuncionariosComandados(int numeroDeFuncionariosComandados) {
		this.numeroDeFuncionariosComandados = numeroDeFuncionariosComandados;
	}


	public double getLucroDoBanco() {
		return lucroDoBanco;
	}


	public void setLucroDoBanco(double lucroDoBanco) {
		this.lucroDoBanco = lucroDoBanco;
	}
	
	
	

}
