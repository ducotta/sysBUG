package banco;

public class Diretor extends Gerente {

		private int numeroDeGerentesSupervisionados;

	public Diretor(String nome, String telefone, String endereco,
				String cpf, String cargo, int senha,
				int numeroDeFuncionariosGerenciados,
				int numeroDeGerentesSupervisionados) {
			super(nome, telefone, endereco, cpf, cargo, senha,
					numeroDeFuncionariosGerenciados);
			this.numeroDeGerentesSupervisionados = numeroDeGerentesSupervisionados;
	}

	public int getNumeroDeGerentesSupervisionados() {
		return numeroDeGerentesSupervisionados;
	}

	public void setNumeroDeGerentesSupervisionados(
			int numeroDeGerentesSupervisionados) {
		this.numeroDeGerentesSupervisionados = numeroDeGerentesSupervisionados;
	}
	
}
