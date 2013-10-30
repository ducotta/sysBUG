package banco;

import java.util.ArrayList;

public class ControleConta {
	
	private ArrayList<Conta> listaDeContas = new ArrayList<Conta>();

	public ArrayList<Conta> getListaDeContas() {
		return listaDeContas;
	}

	public void setListaDeContas(ArrayList<Conta> listaDeContas) {
		this.listaDeContas = listaDeContas;
	}
	
	public void adiciona(Conta c){
		listaDeContas.add(c);
	}
	
	public Conta pegaConta(int x){
		for (int contador = 0; contador < listaDeContas.size(); contador++) {
			if (x == listaDeContas.get(contador).getNumero())
				return listaDeContas.get(contador);
		}
		return null;
	}
	
	public int pegaTotalDeContas(){
		return listaDeContas.size();
	}

}
