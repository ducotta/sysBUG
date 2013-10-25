package banco;
import java.util.ArrayList;


public class SysBUG {
	
	private Cliente cliente;
	private Funcionario funcionario;
	private ArrayList<Conta> listaConta;
	
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

	public ArrayList<Conta> getConta() {
		return listaConta;
	}

	public void setConta(ArrayList<Conta> conta) {
		this.listaConta = conta;
	}
	
	void adicionar(Conta umaConta){
		listaConta.add(umaConta);
	}
	
}
