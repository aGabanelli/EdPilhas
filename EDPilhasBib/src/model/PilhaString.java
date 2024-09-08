package model;

public class PilhaString {

	NoString topo;
	
	public PilhaString() {
		topo = null;
	}
	
	public Boolean isEmpty() {
		if(topo == null) {
			return true;
		}
		return false;
	}
	
	//Insere um elemento na pilha
	public void Push(String e) {
		NoString elemento = new NoString();
		elemento.dado = e;
		if(isEmpty()) {
			topo = elemento;			
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	//Retira o primeiro elemento da pilha
	public String Pop() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Não há elementos para empilhar");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	//Captura o primeiro elemento da pilha, mas não o tira
	public String Top() throws Exception {
		if(isEmpty() == true) {
			throw new Exception("Não há elementos na pilha");
		}
		String valor = topo.dado;
		return valor;
	}
	
	public int Size() {
		int cont = 0;
		if(isEmpty() == false) {
			NoString auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null) {
				cont = cont + 1;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
}
