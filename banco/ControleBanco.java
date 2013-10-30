package banco;


public class ControleBanco {
	
	private SysBUG banco = new SysBUG();

	public void adiciona(Conta c){
		banco.getListaDeContas().add(c);
	}
	
	public Conta pegaConta(int x){
		for (int contador = 0; contador < banco.getListaDeContas().size(); contador++) {
			if (x == banco.getListaDeContas().get(contador).getNumero())
				return banco.getListaDeContas().get(contador);
		}
		return null;
	}
	
	public int pegaTotalDeContas(){
		return banco.getListaDeContas().size();
	}

}
