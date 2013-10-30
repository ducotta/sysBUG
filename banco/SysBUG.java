package banco;
import java.util.ArrayList;


public class SysBUG {
	
	private Cliente cliente;
	private Funcionario funcionario;
	private ArrayList<Conta> listaDeConta = new ArrayList<Conta>();
	
	public SysBUG() {
		super();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public ArrayList<Conta> getListaDeContas() {
		return listaDeConta;
	}

	public void setListaDeContas(ArrayList<Conta> conta) {
		this.listaDeConta = conta;
	}
	
}
